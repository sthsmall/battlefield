package org.example.tools;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class reader {
    public void reader(){
        try{
            DatagramSocket clientSocket = new DatagramSocket();

            // 定义服务器地址和端口
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 52001;

            byte[] bytes = new byte[1024];

            DatagramPacket readPacket = new DatagramPacket(bytes, bytes.length, serverAddress, serverPort);

            // 发送数据包
            clientSocket.receive(readPacket);

            String msg = new String(bytes);
            System.out.println(msg);



        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
