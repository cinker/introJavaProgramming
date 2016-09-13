import java.util.Scanner;

/**
 * Created by cinker on 13/09/2016.
 */
public class ex6_31 {
    public static void main(String[] args) {
/*        Scanner input = new Scanner(System.in);
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
        */
        System.out.print(getSize(55564));
        System.out.print(sumOfOddPlace(55564));
    }

    public static boolean isValid(long number) {
        return true;
    }

    public static int sumOfDoubleEvenPlace(long number){
        return 0;
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
        int sum = 0;
        int size = 4;

        while(size > 3)
        {
            size = getSize(number);
            sum += number/Math.pow(10, size-1);
            number = number % ((long)Math.pow(10, (size-2)));
        }
        return sum;
    }

    public static boolean prefixMatched(long number, int d) {
        return true;
    }

    public static int getSize(long d){
        int count = 0;

        while (d > 0)
        {
            d = d/10;
            count++;
        }
        return count;
    }

    public static long getPrefix(long number, int k){
        return 0;
    }
}
