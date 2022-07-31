package case_study_module2.utils;

import java.util.Scanner;

public class CheckingPatternDate {
    public static final String dateRegex = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";
    public static String checkDate(String date) {
        while (!date.matches(dateRegex)) {
            System.out.println("Ngày tháng năm của bạn nhập vào không đúng định dạng yyyy-mm-dd");
            System.out.printf("Vui lòng nhập lại : ");
            Scanner scanner = new Scanner(System.in);
            date = scanner.nextLine();
        }
        return date;
    }
}
