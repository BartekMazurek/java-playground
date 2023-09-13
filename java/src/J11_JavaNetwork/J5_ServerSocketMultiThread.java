package J11_JavaNetwork;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class J5_ServerSocketMultiThread {
    public static void main(String[] args) throws IOException {

        // MULTI THREAD SERVER
        ServerSocket serverSocket = new ServerSocket(8080);
        ExecutorService executorService = Executors.newFixedThreadPool(10); // 10 CLIENTS MAX

        while (true) {
            final Socket socket = serverSocket.accept();
            Runnable connection = new Runnable() {

                @Override
                public void run() {
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream())
                        );
                        bufferedWriter.write("Hello from server");
                        bufferedWriter.flush();
                        socket.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }; // CONNECTION HANDLED BY EXECUTOR SERVICE
            executorService.submit(connection);
        }
    }
}
