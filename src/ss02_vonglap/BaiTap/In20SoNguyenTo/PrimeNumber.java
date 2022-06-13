package ss02_vonglap.BaiTap.In20SoNguyenTo;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        byte count = 0;
        int numberNeedCheck = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of numbers : ");
        number = scanner.nextInt();
        while(count < number) {
            byte uoc = 0;
            for (int i=1 ; i<=numberNeedCheck ; i++) {
                if (numberNeedCheck % i ==0) {
                    uoc++;
                }
            }
            if (uoc == 2) {
                count++;
                System.out.printf(numberNeedCheck+"  ");
            }
            numberNeedCheck++;
        }
    }
}
