package ss19_string_regex.BaiTap.validate_name_class;

import java.util.Scanner;

public class NameClass {
    public static final String regexName = "^[CAP]+\\d{4}+[G-M]$";
    public static boolean checkClass (String nameClass) {
        return nameClass.matches(regexName);
    }

    public static void main(String[] args) {
        System.out.print("Enter your class name : ");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        if (checkClass(className)) {
            System.out.println(className);
            System.out.println("True");
        } else {
            System.out.println(className);
            System.out.println("False");
        }
    }
}
