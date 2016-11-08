package dom;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.tree.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.w3c.dom.CharacterData;

public class TreeViewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new DOMTreeFrame();
                frame.setTitle("TreeViewer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class DOMTreeFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;

    private DocumentBuilder builder;

    public DOMTreeFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                openFile();
            }
        });
        fileMenu.add(openItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        fileMenu.add(exitItem);

        JMenu menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }

    public void openFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("dom"));

        chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File f) {
                return f.isDirectory()||f.getName().toLowerCase().endsWith(".xml");
            }

            public String getDescription() {
                return "XML files";
            }
        });

        int r = chooser.showOpenDialog(this);
        if (r!=JFileChooser.APPROVE_OPTION) return;
        final File file = chooser.getSelectedFile();

        new SwingWorker<Document, Void>() {
            protected Document doInBackground() throws Exception {
                if (builder == null) {
                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                    builder = factory.newDocumentBuilder();
                }
                return builder.parse(file);
            }
            protected void done() {
                try {
                    Document doc = get();
                    JTree tree = new JTree(new DOMTreeModel(doc));
                    tree.setCellRenderer(new DOMTreeCellRenderer());

                    setContentPane(new JScrollPane(tree));
                    validate();
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(DOMTreeFrame.this, e);
                }
            }
        }.execute();
    }
}