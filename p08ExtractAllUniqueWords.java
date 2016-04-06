import java.util.Scanner;
import java.util.TreeSet;

public class p08ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String inputLine1 = scr.nextLine();
        inputLine1 = inputLine1.toLowerCase();
        String[] lineArray = inputLine1.split("[^a-zA-Z]+");

        TreeSet<String> tree = new TreeSet<String>();
        for (String s : lineArray) {
            tree.add(s);
        }

        for (String s : tree) {
            System.out.printf("%s ", s);
        }
    }
}
