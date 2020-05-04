package SetiPR;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        try {
            Socket socket = new Socket("127.0.0.1", 1989);

            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());

            while (true) {
            System.out.println("PRESS 1 TO LIST BOOKS" + "\n" +
                    "PRESS 2 TO ADD BOOKS" + "\n" +
                    "PRESS 0 TO DISCONNECT FROM SERVER");

            String choice = in.next();
            if (choice.equals("1")) {
                outStream.writeObject("1");

                System.out.println(inStream.readObject());
            }
            else if(choice.equals("2")){
                outStream.writeObject("2");
                System.out.println("ADD THE BOOKS");
                int id=in.nextInt();
                String name=in.next();
                String author=in.next();
                Book book=new Book(id,name,author);
                outStream.writeObject(book);

            }
            else
                break;
    }

    }catch (Exception e) {
        e.printStackTrace();
    }

}
}
