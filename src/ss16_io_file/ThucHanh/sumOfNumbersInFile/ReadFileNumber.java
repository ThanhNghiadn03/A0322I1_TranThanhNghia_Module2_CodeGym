package ss16_io_file.ThucHanh.sumOfNumbersInFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileNumber {
    public static final String fileNumber = "E:\\A0322I1_TranThanhNghia_Module2\\src\\ss16_io_file\\ThucHanh\\sumOfNumbersInFile\\number.txt";
    public static int readFile(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        int sum = 0;
        try {
            fileReader = new FileReader(fileNumber);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file !!!");
        } catch (IOException e) {
            System.out.println("Lỗi nhập xuất file");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Lỗi nhập xuất file");
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Tổng các số trong file : "+ReadFileNumber.readFile(fileNumber));
    }
}
