import java.util.Scanner;

/**
 * Created by cinker on 14/09/2016.
 */
public class ex7_19 {
    public static void main(String[] args){
        System.out.print("Please enter an array of numbers: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = input.nextInt();
        if(isSorted(numbers))
            System.out.println("This list is sorted");
        else
            System.out.println("This list is not sorted");
    }

    public static boolean isSorted(int[] list){
        int sorted = 1;
        for(int i = 0; i < list.length-1; i++){
            if(list[i] > list[i+1])
                sorted = 0;
        }
        if(sorted == 0)
            return false;
        else
            return true;
    }
}
