package SetiPR;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        try {
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());

            books.add(new Book(111, "Crusoe", "Defo"));

            PackageData packageData = new PackageData("library", books);

            String message = "";

            while ((message = (String) inStream.readObject()) != null) {
                if (message.equals("1")) {
                    outStream.writeObject(packageData.toString());
                } else if (message.equals(("2"))) {

                    packageData.addbooks((Book)inStream.readObject());

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



