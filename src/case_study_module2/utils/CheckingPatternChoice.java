package case_study_module2.utils;

import java.util.Scanner;

public class CheckingPatternChoice {
    public static String checkChoice(String choose) {
        Scanner scanner = new Scanner(System.in);
        choose = choose.toUpperCase();
        while (!choose.equals("Y") && !choose.equals("YES") && !choose.equals("N") && !choose.equals("NO")) {
            System.out.printf("Nhập không hợp lệ , vui lòng nhập lại : ");
            choose = scanner.nextLine();
            choose = choose.toUpperCase();
        }
        return choose;
    }
}
