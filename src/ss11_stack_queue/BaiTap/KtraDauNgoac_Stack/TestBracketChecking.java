package ss11_stack_queue.BaiTap.KtraDauNgoac_Stack;

import java.util.Scanner;

public class TestBracketChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression;
        System.out.printf("Nhập vào 1 biểu thức : ");
        expression = scanner.nextLine();
        if (CheckingBracket.bracketChecking(expression)) {
            System.out.println("Valid !!!");
        } else {
            System.out.println("Invalid !!!");
        }
    }
}
