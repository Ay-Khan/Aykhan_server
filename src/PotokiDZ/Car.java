package PotokiDZ;

public class Car extends Thread {
    private String name;
    private int speed;
    private double distance;

    public Car() {
    }

    public Car(String name, int speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void run() {
        try {
            double time=distance/speed;
            for (int i=0;i<time;i++){
                System.out.println(this.name + " is in " +i*speed+" meters");
                Thread.sleep(1000);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
