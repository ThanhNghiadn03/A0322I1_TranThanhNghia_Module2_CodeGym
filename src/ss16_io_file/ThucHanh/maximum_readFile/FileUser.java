package ss16_io_file.ThucHanh.maximum_readFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUser {
    public static final String fileNeedToRead = "E:\\A0322I1_TranThanhNghia_Module2\\src\\ss16_io_file\\ThucHanh\\maximum_readFile\\arrayOfNumbers.txt";
    public static final String fileNeedToWrite = "E:\\A0322I1_TranThanhNghia_Module2\\src\\ss16_io_file\\ThucHanh\\maximum_readFile\\maxInArray.txt";
    public static List<Integer> readArrayNumbers(String path) {
        List<Integer> integerList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null) {
                System.out.println(line);
                integerList.add(Integer.parseInt(line));
            }
            System.out.println("Đã đọc hết !!!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found !!!");
        } catch (IOException e) {
            System.out.println("IO exception !!!");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("IO exception.");
            }
        }
        return integerList;
    }
    public static void writeFile(String path , int max) throws IOException {
        FileWriter fileWriter = new FileWriter(path,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Giá trị lớn nhất là : "+max);
        bufferedWriter.newLine();
        bufferedWriter.close();
        System.out.println("Đã ghi hết !!!");
    }

    public static int maxInteger(List<Integer> arrayNumber) {
        int max = arrayNumber.get(0);
        for (Integer i : arrayNumber) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        System.out.println("Đọc file : ");
        list = FileUser.readArrayNumbers(fileNeedToRead);
        System.out.println("Ghi file : ");
        System.out.println(maxInteger(list));
        FileUser.writeFile(fileNeedToWrite,maxInteger(list));
    }
}
