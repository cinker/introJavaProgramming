import java.util.Scanner;

/**
 * Created by cinker on 13/09/2016.
 */
public class ex6_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer:");
        long card_number = input.nextLong();
        if(isValid(card_number))
        {
            System.out.println(card_number + " is valid");
        }
        else
        {
            System.out.println(card_number + " is invalid");
        }
    }

    public static boolean isValid(long number) {

    }

    public static int sumOfDoubleEvenPlace(long number){
        int i = 0;

        while(i >= 0) {

        }
    }

    public static int getDigit(int number){
        if(number>9)
        {
            return (number%10)+(number/10);
        }
        else
            return number;
    }

    public static int sumOfOddPlace(long number){

    }

    public static boolean prefixMatched(long number, int d) {

    }

    public static int getSize(long d){

    }

    public static long getPrefix(long number, int k){

    }
}
