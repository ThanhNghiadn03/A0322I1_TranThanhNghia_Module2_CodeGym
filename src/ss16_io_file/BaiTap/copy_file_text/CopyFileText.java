package ss16_io_file.BaiTap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static final String sourceFile = "E:\\A0322I1_TranThanhNghia_Module2\\src\\ss16_io_file\\BaiTap\\copy_file_text\\sourceFile.txt";
    public static final String targetFile = "E:\\A0322I1_TranThanhNghia_Module2\\src\\ss16_io_file\\BaiTap\\copy_file_text\\target.txt";

    public static List<String> readFile(String pathFile) {
        List<String> stringList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        int numbersOfChars = 0;
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
                numbersOfChars += line.length();
            }
            System.out.println("Number of characters in file : "+ numbersOfChars);
        } catch (FileNotFoundException e) {
            System.out.println("File not found !!!");
        } catch (IOException e) {
            System.out.println("IO Exception.");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("IO Exception.");
            }
        }
        return stringList;
    }

    public static void writeFile(String pathFile , List<String> stringList) throws IOException {
        FileWriter fileWriter = new FileWriter(pathFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String string : stringList) {
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Read file : ");
        List<String> stringList = new ArrayList<>();
        stringList = CopyFileText.readFile(sourceFile);
        System.out.println("Done !!!");
        System.out.println("Write file : ");
        CopyFileText.writeFile(targetFile,stringList);
        System.out.println("Done !!!");
    }
}
