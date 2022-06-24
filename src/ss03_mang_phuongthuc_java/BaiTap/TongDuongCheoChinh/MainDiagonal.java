package ss03_mang_phuongthuc_java.BaiTap.TongDuongCheoChinh;

import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        byte col=0;
        byte row = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số cột : ");
        col = scanner.nextByte();
        System.out.printf("Nhập vào số hàng : ");
        row = scanner.nextByte();
        int[][] arr2D = new int[row][col];
        for (int i=0 ; i<row ; i++) {
            for (int j=0 ; j<col ; j++) {
                System.out.printf("Nhập vào phần tử thứ ["+i+"]["+j+"]: ");
                arr2D[i][j] = scanner.nextInt();
            }
        }
        for (int i=0 ; i<row ; i++) {
            for (int j=0 ; j<col ; j++) {
                System.out.printf(arr2D[i][j]+"             ");
            }
            System.out.println("");
        }
        int sum = 0;
        for (int i=0 ; i<row ; i++) {
            for (int j=0; j<col ; j++) {
                if (i==j) {
                    sum+=arr2D[i][j];
                }
            }
        }
        System.out.printf("\n\nTổng của đường chéo chính là : "+sum);
    }
}
