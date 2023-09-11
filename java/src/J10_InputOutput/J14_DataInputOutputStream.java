package J10_InputOutput;

import java.io.*;

public class J14_DataInputOutputStream {
    public static void main(String[] args) throws IOException {

        // DataInputStream / DataOutputStream
        // ALLOWS TO READ/WRITE PRIMITIVE TYPES (int, float, double)
        // BINARY STREAM

        DataOutputStream stream = new DataOutputStream(
            new BufferedOutputStream(
                    new FileOutputStream("java/stream.txt")
            )
        );

        stream.writeBoolean(true);
        stream.writeInt(100);
        stream.writeUTF("ĘĄĆĆŻŻ");
        stream.flush(); // FORCE TO WRITE DATA FROM BUFFER INTO FILE
        stream.close();

        System.out.println("Data saved into file");
    }
}
