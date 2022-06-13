package ss02_vonglap.ThucHanh.TinhTienLaiChoVay;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        long money = 1;
        int months = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount : ");
        money = scanner.nextLong();
        System.out.print("Enter number of months : ");
        months = scanner.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextDouble();
        double totalProfit = 0.0;
        for (int i=0 ; i<months ; i++) {
            totalProfit += money * (interestRate/100)/12 * months;
        }
        System.out.println("Total of interest : "+ totalProfit);
    }
}
