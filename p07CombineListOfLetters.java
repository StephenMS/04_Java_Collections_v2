import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p07CombineListOfLetters {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String inputLine1 = scr.nextLine();
        String[] line1Array = inputLine1.split(" ");
        String inputLine2 = scr.nextLine();
        String[] line2Array = inputLine2.split(" ");

        ArrayList<Character> l1 = new ArrayList<>();
        for (String s : line1Array) {
            l1.add(s.charAt(0));
        }
        ArrayList<Character> l2 = new ArrayList<>();
        for (String s : line2Array) {
            l2.add(s.charAt(0));
        }

        int totalLength = l1.size() + l2.size();

        ArrayList<Character> output = new ArrayList<Character>(totalLength);
        for (Character character : l1) {
            output.add(character);
        }

        int counter2 = 0;
        int counter1 = 0;


    }
}
