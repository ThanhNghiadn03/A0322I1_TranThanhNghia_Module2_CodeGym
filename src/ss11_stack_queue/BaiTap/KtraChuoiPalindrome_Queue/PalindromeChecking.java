package ss11_stack_queue.BaiTap.KtraChuoiPalindrome_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecking {
    public static boolean isPalindrome(String palindrome) {
        Queue<Character> listQueue = new LinkedList<>();
        Stack<Character> listStack = new Stack<>();
        for (int i=0 ; i<palindrome.length() ; i++) {
                listQueue.add(palindrome.charAt(i));
                listStack.push(palindrome.charAt(i));
        }
        while (!listStack.isEmpty()) {
            if (listQueue.poll() != listStack.pop()) {
                return false;
            }
        }
        return true;
    }
}
