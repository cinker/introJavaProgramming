import java.util.Scanner;

/**
 * Created by cinker on 16/09/2016.
 */
public class ex8_1 {
    public static void main(String[] args){
        double[][] m = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");

        Scanner input = new Scanner(System.in);
        for(int i = 0; i < m.length; i++)
            for(int j = 0; j < m[m.length-1].length ; j++)
                m[i][j] = input.nextDouble();

        for(int i = 0; i < m[m.length-1].length; i++)
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m, i));
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double columnSum = 0.0;

        for (int i = 0; i < m.length; i++) {
            columnSum += m[i][columnIndex];
        }
        return columnSum;
    }
}
