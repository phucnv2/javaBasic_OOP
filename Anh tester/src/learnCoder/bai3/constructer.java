package learnCoder.bai3;

public class constructer {
    public String name;
    public int age;

    public constructer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + name);
    }

    public static void main(String[] args) {
        constructer ct = new constructer("Kien",30);
        constructer ct1 = new constructer("Long",40);
        ct.display();
        ct1.display();
    }
}
