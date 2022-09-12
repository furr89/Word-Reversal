import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //asks user input then takes input
        System.out.println("Enter phrase: ");
        String phrase = scan.nextLine();

        int phraseLength = phrase.length() - 1;
        char lastChar = '\0';
        boolean isDigit = Character.isDigit(phrase.charAt(phraseLength));
        boolean isLetter = Character.isLetter(phrase.charAt(phraseLength));
        boolean isSpaces = Character.isWhitespace(phrase.charAt(phraseLength));

        //check if the last char is a special character
        if (!isDigit && !isLetter && !isSpaces) {

            //get last char and remove it if it's a special char
            lastChar = phrase.charAt(phraseLength);
            phrase = phrase.substring(0, phraseLength);
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