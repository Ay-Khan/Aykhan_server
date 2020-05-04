package TextDZ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws ParseException {
        Scanner in = new Scanner(System.in);
        ArrayList<GoodItem> products = new ArrayList<>();
        ArrayList<BuyHistory> buyHistories = new ArrayList<>();


        while (true) {

            System.out.println("[1] Add Product");
            System.out.println("[2] List Product");
            System.out.println("[3] Add histories of purchase");
            System.out.println("[4] List histories of purchase");
            System.out.println("[0] Exit");

            int choice = in.nextInt();

            if (choice == 1) {
                GoodItem goodItem;
                String name = in.next();
                int price = in.nextInt();
                goodItem = new GoodItem(name, price);

                products.add(goodItem);
                saveGoodItems(products);

            } else if (choice == 2) {
                for (GoodItem s : products) {
                    System.out.println(s);
                }
            } else if (choice == 3) {
                BuyHistory buyHistory;
                String goodName = in.next();
                int goodPrice = in.nextInt();
                Date buyTime ;
                buyHistories.add(new BuyHistory(goodName, goodPrice, null));
            } else if (choice == 4) {
                for (BuyHistory bh : buyHistories) {
                    System.out.println(bh);
                }
            } else if (choice==0) {
                break;
            }
        }
    }



    //readproducts
    public static ArrayList<GoodItem> getGoodItemList() {
        ArrayList<GoodItem> goodItems = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("good.txt"));
            {
                String line=null;
                GoodItem goodItem1;
                while ((line=br.readLine())!=null) {
                    String price=br.readLine();
                    goodItem1=new GoodItem(line,Integer.parseInt(price));
                    goodItems.add(goodItem1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return goodItems;
    }
        //writeproducts
        public static void saveGoodItems(ArrayList<GoodItem> goodItems) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("good.txt"));

                for (GoodItem goodItem : goodItems){
                    bufferedWriter.write(goodItem.toString() + "\n");
                }

                bufferedWriter.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    public static ArrayList<BuyHistory> getBuyHistoryList(){
        ArrayList<BuyHistory> buyHistories = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("history.txt"));
            {
                String line;
                BuyHistory buyHistory;
                Date time=null;
                while ((line=br.readLine())!=null) {
                    String price = br.readLine();
                    buyHistory = new BuyHistory(line, Integer.parseInt(price),time);
                    buyHistories.add(buyHistory);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buyHistories;
    }

    public static void saveBuyHistories(ArrayList<BuyHistory> buyHistory){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("history.txt"));

            for (BuyHistory buyHistories:buyHistory){
                bufferedWriter.write(buyHistories.toString() + "\n");
            }

            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

