package J10_InputOutput;

import java.io.*;

public class J3_FileInputOutputBuffer {
    public static void main(String[] args) throws IOException {

        // INPUT/OUTPUT BUFFER
        // MORE EFFICIENT (FASTER) THAN FILE STREAM & WRITER/READER
        // STREAMS WRITE/READ DATA INTO/FROM BUFFERS - INCREASE SPEED

        BufferedInputStream bufferedInput = new BufferedInputStream(
                new FileInputStream("java/text.txt")
        );

        BufferedOutputStream bufferedOutput = new BufferedOutputStream(
            new FileOutputStream("java/text_copy.txt")
        );

        int v = 0;
        while((v = bufferedInput.read()) != -1) {
            bufferedOutput.write((char) v);
        }

        bufferedInput.close();
        bufferedOutput.close();

    }
}
