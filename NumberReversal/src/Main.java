import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //take input and turn to string
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        double number = scan.nextDouble();
        String numStr = String.valueOf(number);

        char twoDecSpot = numStr.charAt(numStr.length() - 3);
        char oneDecSpot = numStr.charAt(numStr.length() - 2);
        char lastChar = numStr.charAt(numStr.length() - 1);

        //if user entered a 2 decimal number
        if (twoDecSpot == '.') {

            reverseInput(numStr, 100, number);

        }
        //if user entered a single decimal or none at all
        else if (oneDecSpot == '.') {

            //single decimal
            if (lastChar != '0') {

                numStr = numStr + '0';
                reverseInput(numStr, 10, number);

            }
            //no decimal
            else {

                //remove decimals
                for (int j = 2; j > 0; j --) {

                    numStr = numStr.substring(0, numStr.length() - 1);
                }

                //reverse the string
                String revString = "";
                for (int i = numStr.length() - 1; i >= 0; i--) {

                    revString += numStr.charAt(i);
                }

                int revNum = Integer.parseInt(revString);

                System.out.println("Original: " + (int) number);
                System.out.println("Reverse: " + revNum);

            }

        }

    }

    //handles input reversal for decimal inputs
    static void reverseInput(String _numStr, double numDivider, double inputNumber) {
        _numStr = _numStr.replace(".", "");

        //reverse the string then converts it to double
        String revString = "";
        for (int i = _numStr.length() - 1; i >= 0; i--) {

            revString += _numStr.charAt(i);
        }
        double revNum = Double.parseDouble(revString);

        revNum /= numDivider;

        System.out.println("Original: " + inputNumber);
        System.out.println("Reverse: " + revNum);
    }

}