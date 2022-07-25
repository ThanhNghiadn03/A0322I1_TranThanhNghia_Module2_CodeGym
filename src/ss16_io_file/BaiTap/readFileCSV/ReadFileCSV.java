package ss16_io_file.BaiTap.readFileCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadFileCSV {
    public static final String pathFile = "E:\\A0322I1_TranThanhNghia_Module2\\src\\ss16_io_file\\BaiTap\\readFileCSV\\Nation.CSV";
    public static void readFile(String pathFile) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Nation nation;
            while ((line = bufferedReader.readLine())!=null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];
                nation = new Nation(id,code,name);
                System.out.println(nation);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found !!!");
        } catch (IOException e) {
            System.out.println("IO Exception !!!");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("IO Exception");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Read file CSV");
        ReadFileCSV.readFile(pathFile);
        System.out.println("Done !!!");
    }
}
