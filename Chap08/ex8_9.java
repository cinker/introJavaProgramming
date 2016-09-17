import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by cinker on 17/09/2016.
 * bug: 主对角线检查失败
 */
public class ex8_9 {
    public static void main(String[] args) {
        int[][] m = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };

        printBoard(m);
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a row (0, 1 or 2) for player X: ");
            int i = input.nextInt();
            System.out.print("Enter a column (0, 1 or 2) for player X: ");
            int j = input.nextInt();

            m[i][j] = 1;

            printBoard(m);

            if(judgeWinner(m))
                break;

            System.out.print("Enter a row (0, 1 or 2) for player O: ");
            i = input.nextInt();
            System.out.print("Enter a column (0, 1 or 2) for player O: ");
            j = input.nextInt();
            m[i][j] = 2;

            printBoard(m);

            if(judgeWinner(m))
                break;
        }
    }

    public static void printBoard(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println("-------");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("|");
                if (m[i][j] == 0)
                    System.out.print(" ");
                else if (m[i][j] == 1)
                    System.out.print("X");
                else
                    System.out.print("O");
            }
            System.out.println("|");
        }
        System.out.println("-------");
    }

    public static boolean judgeWinner(int[][] m) {
        int p1_count = 0;
        int p2_count = 0;
        boolean hasWinner = false;

        //检查横列
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1)
                    p1_count++;
                else if (m[i][j] == 2)
                    p2_count++;

                if (p1_count == 3) {
                    System.out.println("X player won");
                    hasWinner = true;
                }
                else if (p2_count == 3) {
                    System.out.println("O player won");
                    hasWinner = true;
                }
            }
            p1_count = 0;
            p2_count = 0;

        }

        p1_count = 0;
        p2_count = 0;

        //检查纵列
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[j][i] == 1)
                    p1_count++;
                else if (m[j][i] == 2)
                    p2_count++;
                if (p1_count == 3) {
                    System.out.println("X player won");
                    hasWinner = true;
                }
                else if (p2_count == 3) {
                    System.out.println("O player won");
                    hasWinner = true;
                }
            }
            p1_count = 0;
            p2_count = 0;

        }
        p1_count = 0;
        p2_count = 0;

        //检查对角线
        //检查主对角线
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    if (m[i][j] == 1)
                        p1_count++;
                    else if (m[i][j] == 2)
                        p2_count++;
                }

                if (p1_count == 3) {
                    System.out.println("X player won");
                    hasWinner = true;
                }
                else if (p2_count == 3) {
                    System.out.println("O player won");
                    hasWinner = true;
                }
            }
        }
        p1_count = 0;
        p2_count = 0;

        //检查副对角线
        for (int i = 0; i < m.length; i++) {
            if (m[i][2 - i] == 1)
                p1_count++;
            else if (m[i][2 - i] == 2)
                p2_count++;
            if (p1_count == 3) {
                System.out.println("X player won");
                hasWinner = true;
            }
            else if (p2_count == 3) {
                System.out.println("O player won");
                hasWinner = true;
            }
        }
        return hasWinner;
    }
}

