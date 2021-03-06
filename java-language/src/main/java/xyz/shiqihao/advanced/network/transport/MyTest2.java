package xyz.shiqihao.advanced.network.transport;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * find the low ports used.
 */
public class MyTest2 {

    public static void main(String[] args) {
        final String HOST = args.length > 0 ? args[0] : "127.0.0.1";

        for (int i = 0; i <= 1024; i++) {
            try {
                Socket socket = new Socket(HOST, i);
                System.out.println("There is a server on port " + i + " of " + HOST);
                socket.close();
            } catch (UnknownHostException e) {
                System.out.println(e.getMessage());
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
