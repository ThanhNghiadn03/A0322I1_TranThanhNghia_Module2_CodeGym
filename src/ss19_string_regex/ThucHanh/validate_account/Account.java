package ss19_string_regex.ThucHanh.validate_account;

import java.util.Scanner;

public class Account {
    public static final String regexAccount = "^[_a-z0-9]{6,}$";
    public static boolean checkAccount(String account) {
        return account.matches(regexAccount);
    }

    public static void main(String[] args) {
        System.out.print("Enter your name account : ");
        Scanner scanner = new Scanner(System.in);
        String nameAccount;
        nameAccount = scanner.nextLine();
        if (checkAccount(nameAccount)) {
            System.out.println(nameAccount);
            System.out.println("True");
        } else {
            System.out.println(nameAccount);
            System.out.println("false");
        }
    }
}
