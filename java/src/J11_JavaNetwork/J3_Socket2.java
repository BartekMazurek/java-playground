package J11_JavaNetwork;

import java.io.*;
import java.net.Socket;

public class J3_Socket2 {
    public static void main(String[] args) throws IOException {

        // GET WEB PAGE
        Socket socket = new Socket("duckduckgo.com", 80);

        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream())
        );

        // SEND TO SERVER
        writer.write("GET / HTTP/1.0\n\n");
        writer.flush();

        // GET DATA FROM SERVER
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(socket.getInputStream())
        );

        // DISPLAY DATA
        String data;
        while((data = reader.readLine()) != null) {
            System.out.println(data);
        }

    }
}
