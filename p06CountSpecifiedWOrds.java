import java.util.Scanner;

public class p06CountSpecifiedWOrds {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String inputLine = scr.nextLine();
        String keyWord = scr.nextLine();
        String[] inputArrayString = inputLine.split("[^a-zA-Z]+");

        int counter = 0;
        for (String s : inputArrayString) {
            if (s.equals(keyWord)) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
