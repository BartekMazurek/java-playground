package J11_JavaNetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class J2_Socket {
    public static void main(String[] args) throws IOException {

        // GET DOMAIN INFO FROM SERVER
        Socket socket = new Socket("whois.internic.net", 43);
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        writer.println("google.com");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );

        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }

    }
}
