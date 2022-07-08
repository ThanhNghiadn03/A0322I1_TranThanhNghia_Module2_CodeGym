package ss11_stack_queue.BaiTap.ThapPhanSangNhiPhan;

import java.util.Stack;

public class BinaryToDecimal {
    public static void reverse(int decimal){
        Stack<Integer> binary = new Stack<>();
        while (decimal > 0) {
            int surplus = decimal%2;
            binary.push(surplus);
            decimal = decimal/2;
        }
        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }
    }
}
