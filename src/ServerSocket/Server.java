package ServerSocket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[]){
        try{
            ServerSocket server = new ServerSocket(1989);
            System.out.println("Waiting for a connection...");
            Socket socket = server.accept();
            System.out.println("Client connected");
            ObjectOutputStream outStream =
                    new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream =
                    new ObjectInputStream(socket.getInputStream());

            MessageData messageData;

            while(true){
                if ((messageData=(MessageData)inStream.readObject())!=null) {
                System.out.println(messageData.toString());

                outStream.writeObject("Hello client");

                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

