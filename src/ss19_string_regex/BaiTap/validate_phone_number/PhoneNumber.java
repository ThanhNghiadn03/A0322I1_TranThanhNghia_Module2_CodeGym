package ss19_string_regex.BaiTap.validate_phone_number;

import java.util.Scanner;

public class PhoneNumber {
    public static final String regexPhoneNumber = "^\\({1}+[1-9]{2}+\\){1}+\\-{1}+\\({1}+[0]{1}+[0-9]{9}+\\){1}$";
    public static boolean checkPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(regexPhoneNumber);
    }

    public static void main(String[] args) {
        System.out.printf("Enter your phone number : ");
        Scanner scanner= new Scanner(System.in);
        String phoneNumber = scanner.nextLine();
        if (checkPhoneNumber(phoneNumber)) {
            System.out.println(phoneNumber);
            System.out.println("True");
        } else {
            System.out.println(phoneNumber);
            System.out.println("False");
        }
    }
}
