package learnCoder.bai3;

public class Cirle {
    private double radius;

    public Cirle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
    public double getCircumference(){
        return 3.14 * 2 * radius;
    }
    public void display(){
        System.out.println("Dien tich hinh tron: "+getArea());
        System.out.println("Chu vi hinh tron: "+getCircumference());
    }

    public static void main(String[] args) {
        Cirle c = new Cirle(7);
        c.display();
    }
}
