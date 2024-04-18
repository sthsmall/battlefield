package org.example.tools;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Reader {
    public void startReading() throws IOException {

            // 创建UDP Socket
            DatagramSocket clientSocket = new DatagramSocket(52002);

            // 定义服务器地址和端口
            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
            int serverPort = 52002;

            // 准备接收数据的缓冲区
            byte[] buffer = new byte[2048];

            // 循环接收数据
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length,serverAddress,serverPort);

                // 接收数据包
                clientSocket.receive(receivePacket);
                System.out.println(1);

                // 将接收到的数据转换为字符串并打印
                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received message: " + receivedMessage);
            }


    }
}
