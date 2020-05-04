package SetiGui;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler extends Thread{
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run(){
        try {
            ObjectInputStream instr=new ObjectInputStream(socket.getInputStream());
            String message=null;
            while ((message=(String)instr.readObject())!=null){
                System.out.println(message);
            }
            System.out.println("Client disconnected");
            instr.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
