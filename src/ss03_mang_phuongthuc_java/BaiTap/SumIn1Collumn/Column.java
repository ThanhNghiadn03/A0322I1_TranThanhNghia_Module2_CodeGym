package ss03_mang_phuongthuc_java.BaiTap.SumIn1Collumn;

import java.util.Scanner;

public class Column {
    public static void main(String[] args) {
        int[][] arr2D = {{21,32,13,54},{95,46,87,18},{99,13,14,12},
                {13,17,22,16}};
        for (int i=0 ; i<4 ; i++) {
            for (int j=0 ; j<4 ; j++) {
                System.out.printf(arr2D[i][j]+" ");
            }
            System.out.println("");
        }
        Scanner scanner = new Scanner(System.in);
        byte col = 0;
        int sum=0;
        do {
            System.out.println("Bạn muốn tính tổng của cột thứ mấy ? ");
            col = scanner.nextByte();
        }while (col<1 || col>4);
        for (int i=0 ; i<4 ; i++) {
            sum += arr2D[i][col-1];
        }
        System.out.printf("\nTổng của cột thứ "+col+" là : "+sum);
    }
}
