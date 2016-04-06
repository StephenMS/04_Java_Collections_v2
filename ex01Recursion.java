import java.util.Scanner;

public class ex01Recursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inputNumber = scn.nextInt();

        PrintRecursion(inputNumber);
    }



    public static void PrintRecursion(int n) {
        if (n < 1) {
            return;
        }
        PrintRecursion(n-1);
        System.out.print(n + " ");
    }
}
