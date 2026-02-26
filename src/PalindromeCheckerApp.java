import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text : ");
        String input = scanner.nextLine();
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--)
        {
            reversed = reversed + input.charAt(i);
        }
        if (input.equals(reversed)) {
            System.out.println("Is it a Palindrome? Yes");
        }
        else
        {
            System.out.println("Is it a Palindrome? No");
        }
        scanner.close();
    }
}