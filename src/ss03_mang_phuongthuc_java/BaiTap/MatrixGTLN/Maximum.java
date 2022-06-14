package ss03_mang_phuongthuc_java.BaiTap.MatrixGTLN;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        int[][] matrix;
        byte coll,row;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Enter number of columns : ");
            coll = scanner.nextByte();
            System.out.printf("Enter number of rows : ");
            row = scanner.nextByte();
        } while ((coll<0 || coll>20)||(row<0 || row > 20));
        matrix = new int[row][coll];
        for (int i=0 ; i<row; i++) {
            for (int j=0 ; j<coll ; j++) {
                System.out.printf("Enter element["+i+"]["+j+"] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = matrix[0][0];
        for (int i=0 ; i<row ; i++) {
            for (int j=0 ; j<coll ; j++) {
                System.out.printf(matrix[i][j]+"  ");
                if (matrix[i][j]>max) {
                    max = matrix[i][j];
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("\nMax in matrix : "+max);
    }
}
