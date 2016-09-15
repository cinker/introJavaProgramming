import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by cinker on 15/09/2016.
 */
public class ex7_35 {
    public static void main(String[] args){
        String[] words = {"write", "that"};
        String random_word = randomWord(words);
        int[] word_index = new int[random_word.length()];
        Arrays.fill(word_index,0);
        int times_left = random_word.length();
        int missing_times = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            for (int i = times_left; i > 0; i--) {
                System.out.print("(Guess) Enter a letter in word ");
                for (int j = random_word.length() - 1; j >= 0; j--)
                    if (word_index[j] == 0)
                        System.out.print('*');
                    else
                        System.out.print(random_word.charAt(j));
                System.out.print(" > ");
                char guess_char = input.next().trim().charAt(0);

                if (random_word.indexOf(guess_char) != -1) {
                    if (word_index[random_word.indexOf(guess_char)] == 1) {
                        System.out.println(guess_char + " is already in the word");
                        i++;
                    }
                    else
                        word_index[random_word.indexOf(guess_char)] = 1;
                } else
                    System.out.println(guess_char + " is not in the word");
            }
            for (int i = 0; i < word_index.length; i++)
                missing_times += word_index[i];
            System.out.println("The word is " + random_word + ". You missed " + (random_word.length() - missing_times) + " times.");
            System.out.println("Do you want to guess another word? Enter y or n> ");
            char choice;
            choice = input.next().trim().charAt(0);
            if (choice == 'n')
                break;
        }
    }
    public static String randomWord(String[] words){
        return words[(int)(words.length * Math.random())];
    }
    public static void guessWord(){
        System.out.println();
    }
}
