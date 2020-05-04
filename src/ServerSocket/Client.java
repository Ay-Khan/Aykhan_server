package ServerSocket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        try{
            Socket socket = new Socket("127.0.0.1",1989);
            ObjectOutputStream outStream =
                    new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream =
                    new ObjectInputStream(socket.getInputStream());
            Date date = new Date();
            System.out.println("Hello. Enter your name & message text");
            while(true){
                String name =in.next();
                String mText=in.next();
                outStream.writeObject(new MessageData(name,mText,date));
                String message;

                if((message = (String) inStream.readObject())!=null){
                    System.out.println(message);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
