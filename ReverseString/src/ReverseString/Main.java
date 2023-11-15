package ReverseString;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kindly Enter a String    ");

        char [] text = scanner.nextLine().toCharArray();
        System.out.print("Reverse String: ");

        for (int i = text.length - 1; i >= 0; i--) {
            System.out.print(text[i]);
        }

        System.out.print("\n");



    }
}
