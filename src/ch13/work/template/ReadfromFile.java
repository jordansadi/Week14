package ch13.work.template;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadfromFile extends BookReader {
    private BufferedReader in = null;
    private String fileName;

    @Override
    void initialize() {
        fileName = "F:\\152 135\\Unit 4\\chapter13\\src\\ch13\\work\\template\\prideprejudice";
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    @Override
    void startReading() {
        String line;
        try {
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
        }
    }

    @Override
    void stopReading() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
