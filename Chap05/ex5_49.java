/*
5.49 (Count vowels and consonants) Assume letters A , E , I , O , and U as the vowels.
Write a program that prompts the user to enter a string and displays the number
of vowels and consonants in the string.
*/

import java.util.Scanner;

import static java.lang.Character.isLetter;
import static java.lang.Character.toUpperCase;

public class Main {

    public static void main(String[] args) {
        int i, vowel_count=0, consonant_count = 0;
        String texts;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        texts = input.nextLine();
        for(i=0; i<texts.length(); i++)
        {
            if (isLetter(texts.charAt(i)))
            {
                if (toUpperCase(texts.charAt(i)) == 'A' || toUpperCase(texts.charAt(i)) == 'E' ||
                        toUpperCase(texts.charAt(i)) == 'I' || toUpperCase(texts.charAt(i)) == 'O' || toUpperCase(texts.charAt(i)) == 'U')
                    vowel_count += 1;
                else
                    consonant_count += 1;
            }
        }
        System.out.println("The number of vowels is " + vowel_count);
        System.out.println("The number of vowels is " + consonant_count);
        }
    }
