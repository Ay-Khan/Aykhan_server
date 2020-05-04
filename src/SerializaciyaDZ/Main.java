package SerializaciyaDZ;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Game game = null;
        while (true) {

            System.out.println("[1] Create game");
            System.out.println("[2] Add player");
            System.out.println("[3] Play game");
            System.out.println("[4] Exit");

            int choice = in.nextInt();

            if (choice == 1) {
                System.out.println(" Game name: " +" IP address: " +" PORT:");
                String gameName = in.next();
                String ipAddress = in.next();
                int port = in.nextInt();
                game=new Game(gameName,ipAddress,port);
                saveGame(game);

            } else if (choice == 2) {
                System.out.println(" Nickname: " +"Rating:");
                String nickName = in.next();
                double rating = in.nextDouble();
                Players players1 = new Players(nickName,rating);

                addPlayers(players1);
            }
            else if (choice==3) {
                System.out.println(players(game));
            }
            else
                break;
        }
    }

    public static void saveGame(Game game) {
        System.out.println(game);
    }


    public static void addPlayers(Players player) {
        ArrayList<Players> players=new ArrayList<>();
        players.add(player);
        try {
            ObjectOutputStream outStream =
                    new ObjectOutputStream(new FileOutputStream("settings.data"));
            outStream.writeObject(players);
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static ArrayList<Players> players(Game game){
        ArrayList<Players> players = new ArrayList<>();
        try{
            File file = new File("settings.data");
            if (file.exists()){
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("settings.data"));

                players = (ArrayList<Players>)ois.readObject();
                ois.close();
                game.setPlayers(players);
            }else{
                System.out.println("NO PLAYERS");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return players;
    }


}


