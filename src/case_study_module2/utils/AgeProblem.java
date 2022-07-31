package case_study_module2.utils;

import case_study_module2.models.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeProblem {
    public static boolean isTrue = false;
    public static void checkOfficial(LocalDate dateOfBirth) throws AgeException {
        if ((LocalDate.now().getYear()-dateOfBirth.getYear()) < 18 || (LocalDate.now().getYear()-dateOfBirth.getYear()) >100) {
            throw new AgeException("Độ tuổi của bạn không phù hợp để sử dụng dịch vụ.");
        } else {
            isTrue = true;
        }
    }
    public static String checkAge(String date) {
        while (true) {
            try {
                if (AgeProblem.isTrue) {
                    break;
                }
                LocalDate checkDate = LocalDate.parse(date, Person.dateTimeFormatter);
                checkOfficial(checkDate);
            } catch (AgeException e) {
                System.out.print(e.getMessage());
                System.out.print("\nBạn phải nhập lại ngày sinh : ");
                Scanner scanner = new Scanner(System.in);
                date = scanner.nextLine();
            }
        }
        isTrue = false;
        return date;
    }
}
