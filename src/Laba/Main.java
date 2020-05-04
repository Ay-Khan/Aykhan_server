package Laba;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Players> players = new ArrayList<>();
        players.add(new Players("Mike",20000,22));
        players.add(new Players("John",30000,23));
        players.add(new Players("Ron",40000,24));
        int sum=0;
        double sum1=0;
        double sr=0;

        for (int i=0;i<players.size();i++){
            sum+=players.get(i).getAge();
            sum1+=players.get(i).getPrice();
        }
        System.out.println("Сумма возраста: " + sum);
        System.out.println("Среднее значение: " + sum1/players.size());




    }
}
