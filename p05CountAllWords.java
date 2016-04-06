import java.util.Scanner;

public class p05CountAllWords {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String inputLine = scr.nextLine();
        String[] inputArrayString = inputLine.split("[^a-zA-Z]+");  // Use any non-letter character as word separator


        System.out.println(inputArrayString.length);
    }
}
