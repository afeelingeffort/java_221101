import java.net.*;
import java.io.*;

public class java_p699_Networking_UDPSocket_Client_ex16_8 {

    public void start() throws IOException, UnknownHostException {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

        byte[] msg = new byte[100];

        DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);
        DatagramPacket inPacket = new DatagramPacket(msg, msg.length);

        datagramSocket.send(outPacket);
        datagramSocket.receive(inPacket);

        System.out.println("current server time: " + new String(inPacket.getData()));
        datagramSocket.close();
    }

    public static void main(String[] args) {
        try {
            new java_p699_Networking_UDPSocket_Client_ex16_8().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
