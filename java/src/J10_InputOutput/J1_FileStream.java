package J10_InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class J1_FileStream {

    public static void main(String[] args) throws IOException {

        // READ & WRITE INTO FILE
        // BYTE STREAMS

        FileInputStream inputFile = new FileInputStream("java/text.txt");
        FileOutputStream outputFile = new FileOutputStream("java/copy.txt");

        int v;
        while ((v = inputFile.read()) != -1) {
            outputFile.write(v);
        }

        if (inputFile != null) inputFile.close();
        if (outputFile != null) outputFile.close();
    }

}
