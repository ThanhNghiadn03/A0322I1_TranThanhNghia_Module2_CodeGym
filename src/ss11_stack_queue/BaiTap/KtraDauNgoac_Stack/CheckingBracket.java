package ss11_stack_queue.BaiTap.KtraDauNgoac_Stack;

import java.util.Stack;

public class CheckingBracket {
    public static boolean bracketChecking(String expression) {
        Stack<Character> bracketStack = new Stack<>();
        for (int i=0 ; i<expression.length() ; i++) {
            if (expression.charAt(i)=='(') {
                bracketStack.push(expression.charAt(i));
            } else if (expression.charAt(i)==')'){
                if (bracketStack.isEmpty()) {
                    return false;
                } else {
                    bracketStack.pop();
                }
            }
        }
        if (bracketStack.isEmpty()) return true;
        else return false;
    }
}
