package ss11_stack_queue.BaiTap.DemTuTrongChuoi_Map;

import java.util.Scanner;

public class TestCountWord {
    public static void main(String[] args) {
        String sentence;
        Scanner scanner = new Scanner(System.in);
        sentence = scanner.nextLine();
        System.out.println("Đếm số lần xuất hiện của các từ trong câu :");
        CountingWord.countingWord(sentence);
    }
}
