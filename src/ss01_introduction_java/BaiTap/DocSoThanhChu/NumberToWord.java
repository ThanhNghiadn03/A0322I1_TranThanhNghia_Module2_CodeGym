package ss01_introduction_java.BaiTap.DocSoThanhChu;

import java.util.Scanner;

public class NumberToWord {
    final static String arrayNumber[] = {"","one","two", "three","four","five","six","seven","eight","nine", "ten","eleven","twelve","thirteen", "fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
    final static String arrayRoundNum[] = {"","","twenty","thirty","fourty","fifty","sixty","seventy", "eighty","ninety"};

    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number : ");
        number = scanner.nextInt();
        if (number < 20) {
            System.out.println(arrayNumber[number]);
        } else if (number < 100) {
            if (number%10==0) {
                System.out.println(arrayRoundNum[number/10]);
            } else {
                System.out.println(arrayRoundNum[number/10]+" "+arrayNumber[number%10]);
            }
        } else if (number < 1000) {
            if (number%100==0) {
                System.out.println(arrayNumber[number/100]+" hundred");
            } else if ((number%100)<20) {
                System.out.println(arrayNumber[number/100]+" hundred and "+arrayNumber[number%100]);
            } else {
                System.out.println(arrayNumber[number / 100] + " hundred and " + arrayRoundNum[(number % 100) / 10] +" "+ arrayNumber[number % 10]);
            }
        }
    }
}
