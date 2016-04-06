import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();
        String[] inputArrString = inputLine.split(" ");

        HashMap<String, Integer> stringCount = new HashMap<String, Integer>();
        for (String word : inputArrString) {
            Integer count = stringCount.get(word);
            if (count == null) {
                count = 0;
            }
            stringCount.put(word, count + 1);
        }
        // System.out.println(stringCount);

        int maxValueInMap = (Collections.max(stringCount.values()));  // This will return max value in the Hashmap

        for (String word : stringCount.keySet()) {
            int count = stringCount.get(word);
            if (count == maxValueInMap) {
                for (int i = 0; i < count; i++) {
                    System.out.printf("%s ", word);
                }
                break;
            }
            System.out.println();
        }
    }
}
