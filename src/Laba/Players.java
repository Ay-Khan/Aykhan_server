package Laba;

public class Players {
        private String name;
        private double price;
        private int age;

    public Players() {
        this.name = "No name";
        this.price=0;
        this.age=0;
    }

    public Players(String name, double price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
