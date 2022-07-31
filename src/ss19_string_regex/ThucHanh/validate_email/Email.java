package ss19_string_regex.ThucHanh.validate_email;

import java.util.Scanner;

public class Email {
    public static final String regexEmail = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
    public static boolean checkEmail(String email) {
        return email.matches(regexEmail);
    }

    public static void main(String[] args) {
        System.out.print("Enter your email : ");
        String email;
        Scanner scanner = new Scanner(System.in);
        email = scanner.nextLine();
        if (checkEmail(email)) {
            System.out.println(email);
            System.out.println("Good");
        } else {
            System.out.println(email);
            System.out.println("Bad");
        }
    }
}
