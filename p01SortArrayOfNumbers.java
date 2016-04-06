import java.util.Arrays;
import java.util.Scanner;

public class p01SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfNumbers = input.nextInt();   // n - numbers
        int[] arrayOfInt = new int[countOfNumbers];
        for (int i = 0; i < countOfNumbers; i++) {
            arrayOfInt[i] = input.nextInt();
        }
        Arrays.sort(arrayOfInt);

        for (int i : arrayOfInt) {
            System.out.printf("%d ", i);
        }
    }
}
