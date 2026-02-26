import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // 1. Define the input string to validate
        String input = "civic";
        System.out.println("Input : " + input);
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            queue.add(c);   // Enqueue operation
            stack.push(c);  // Push operation
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}