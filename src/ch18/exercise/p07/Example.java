package ch18.exercise.p07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    //* Reference : [Book. 이것이 자바다] p.823
    public static void main(String[] args) throws IOException {
        String filePath = "src/ch18/exercise/p07/Example.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            rowNumber++;
            rowData = br.readLine();
            if (rowData == null) break;
            System.out.println(rowNumber + "\t" + rowData);
        }

        br.close();
        fr.close();

    }
}
