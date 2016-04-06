import java.util.ArrayList;
import java.util.Scanner;

public class p04LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();
        // inputLine = inputLine + " " + Integer.MIN_VALUE;
        String[] inputArrString = inputLine.split(" ");

        System.out.print(inputArrString[0] + " ");  // print the first element in array
        int bestLength = 1;
        int bestStartPos = 0;
        int currentSequenceLength = 1;

        // checking for a longest increasing sequence
        for (int i = 0; i < inputArrString.length-1; i++) {
            int number1 = Integer.parseInt(inputArrString[i]);
            int number2 = Integer.parseInt(inputArrString[i + 1]);
            if (number2 > number1) {
                currentSequenceLength++;
                if (currentSequenceLength > bestLength) {
                    bestLength = currentSequenceLength;
                    bestStartPos = i - bestLength + 2 ;
                }
                System.out.print(number2 + " ");
            } else {
                System.out.println();
                System.out.print(number2 + " ");
//                if (currentSequenceLength > bestLength) {
//                    bestLength = currentSequenceLength;
//                    bestStartPos = i - bestLength + 1;
//                }
                currentSequenceLength = 1;  // set best length to 1 --> read next sequence
            }
        }

        // printing the result: longest sequence
        System.out.print("\r\nLongest: ");
        for (int i = bestStartPos; i < bestStartPos + bestLength; i++) {
            System.out.printf("%s ", inputArrString[i]);
        }
        System.out.println();
    }
}
