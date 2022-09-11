import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //asks user input then takes input
        System.out.println("Enter phrase: ");
        String phrase = scan.nextLine();

        int endOfPhrase = phrase.length() - 1;
        char lastChar = '\0';

        //check if the last char is a special character
        if (!Character.isDigit(phrase.charAt(endOfPhrase)) && !Character.isLetter(phrase.charAt(endOfPhrase))
                && !Character.isWhitespace(phrase.charAt(endOfPhrase))) {

            //get last char and remove it if its a special char
            lastChar = phrase.charAt(phrase.length() - 1);
            phrase = phrase.substring(0, phrase.length() - 1);
        }

        //store phrase in array
        String reversedStr = "";
        String[] inverseArr = phrase.split(" ");

        //split and store it in string
        for (int i = inverseArr.length - 1; i >= 0; i--) {
            reversedStr += inverseArr[i] + " ";
        }
        reversedStr = reversedStr.substring(0, reversedStr.length() - 1); //removes the last whitespace

        //checks if the lastChar variable is a special char
        if (lastChar != '\0') {

            System.out.println("Original: " + phrase);
            System.out.println("Reversed: " + reversedStr + lastChar);
        }
        else {
            System.out.println("Original: " + phrase);
            System.out.println("Reversed: " + reversedStr);
        }

    }

}