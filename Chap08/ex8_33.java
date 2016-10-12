import java.util.Scanner;

/**
 * Created by cinker on 16/09/2016.
 */
public class ex8_33 {
    public static void main(String[] args) {
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        Scanner input = new Scanner(System.in);
        double[][] coods = new double[4][2];
        for (int i=0;i<coods.length;i++)
        {
            for(int j=0;j<coods[coods.length-1].length;j++)
            {
                coods[i][j] = input.nextInt();
            }
        }

        double inter_y = ((coods[0][1]-coods[2][1])*(coods[3][1]-coods[1][1])*coods[0][0] + (coods[3][1]-coods[1][1])*(coods[2][0]-coods[0][0])*coods[0][1] + (coods[2][1]-coods[0][1])*(coods[3][1]-coods[1][1])*coods[1][0] + (coods[1][0]-coods[3][0])*(coods[2][1]-coods[0][1])*coods[1][1] )
                / ( (coods[2][0]-coods[0][0])*(coods[3][1]-coods[1][1]) + (coods[0][1]-coods[2][1])*(coods[3][0]-coods[1][0]) );
        double inter_x =  coods[1][0] + (coods[3][0]-coods[1][0])*(inter_y-coods[1][1]) / (coods[3][1]-coods[1][1]);

        double[] areas = new double[4];
//        for (int i=0;i<areas.length;i++) {
//            areas[i] = calArea()
        }

//    }

    public static double calArea(double a, double b, double c) {
        double p = 1/2*(a+b+c);
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }

}
