package J11_JavaNetwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class J1_InetAddress {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress ip = InetAddress.getByName("www.google.com");

        System.out.println("Host: " + ip.getHostName());
        System.out.println("IP: " + ip.getHostAddress());

        InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
        for (int i = 0; i < addresses.length; i++) {
            System.out.println(addresses[i]);
        }
    }
}
