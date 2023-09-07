package J10_InputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class J2_FileReaderWriter {
    public static void main(String[] args) throws IOException {

        // FILE READER & WRITER
        // USED TO OPERATE ON 2 BYTE (16 BITS) UNICODE CHARS

        FileReader input = new FileReader("java/text.txt");
        FileWriter output = new FileWriter("java/text_copy.txt");

        int v;
        while((v = input.read()) != -1) {
            //System.out.println((char)v);
            output.write(v);
        }

        input.close();
        output.close();
    }
}
