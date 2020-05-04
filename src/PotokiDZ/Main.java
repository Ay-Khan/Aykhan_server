package PotokiDZ;

import java.util.ArrayList;

public class Main {
    static double Distance = 1000;

    public static void main(String args[]) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Ferari", 100, Distance));
        cars.add(new Car("Audi", 230, Distance));
        cars.add(new Car("Fiat", 350, Distance));
        cars.add(new Car("Ford", 470, Distance));
        cars.add(new Car("BMW", 790, Distance));



       /* c5.start();  cars.get(c1).start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();*/

    }

    /*public static void bubbleSort(ArrayList<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < cars.size(); j++) {
                if (cars.get(j)>cars.get(j+1)) {
                    Car bubble = null;
                    bubble=cars.get(j);
                    cars.get(j)=cars.get(j+1);
                    cars.get(j+1)=bubble;

                }*/
            }
     //   }
    //}
//}


