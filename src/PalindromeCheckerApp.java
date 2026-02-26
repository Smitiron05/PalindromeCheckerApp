import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer";
        System.out.println("Input : " + input);
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            Character front = deque.removeFirst();
            Character rear = deque.removeLast();
            if (!front.equals(rear)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}