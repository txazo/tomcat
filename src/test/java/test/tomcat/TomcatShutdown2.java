package test.tomcat;

import java.net.Socket;

public class TomcatShutdown2 {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 8005);
        socket.getOutputStream().write("SHUTDOWN".getBytes());
        socket.getOutputStream().flush();
        socket.getOutputStream().close();
        socket.close();
        System.out.println("Tomcat stoped.");
    }

}
