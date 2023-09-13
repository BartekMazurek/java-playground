package J11_JavaNetwork;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class J4_ServerSocket {
    public static void main(String[] args) throws IOException {

        // SIMPLE SERVER
        // HANDLE ONLY ONE CLIENT/BROWSER

        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept(); // BLOCK PROGRAM TILL CLIENT REQUEST

        PrintWriter writer = new PrintWriter(socket.getOutputStream()); // DATA FOR CLIENT
        writer.println("HTTP/1.1 200 OK");
        writer.println("Content-Type: text/html; charset=utf-8");
        writer.println("Connection: Keep-Alive");
        writer.println();

        System.out.println("Write text:");
        Scanner scanner = new Scanner(System.in);
        String str;

        while ( !(str = scanner.nextLine()).equals("exit")) {
            writer.println(str);
            writer.flush();
        }

        scanner.close();
        socket.close();
    }
}
