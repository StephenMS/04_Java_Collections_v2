import java.util.LinkedHashMap;
import java.util.Scanner;

public class p09MostFrequentWord {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String inputLine1 = scr.nextLine();
        inputLine1 = inputLine1.toLowerCase();
        String[] lineArray = inputLine1.split("[^a-zA-Z]+");

        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();
        for (String s : lineArray) {
           // if (hashMap.containsKey(s))
        }

    }
}
