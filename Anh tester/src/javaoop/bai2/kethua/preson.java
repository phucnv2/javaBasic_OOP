package javaoop.bai2.kethua;

public class preson {
    public String name;
    public int age;
    public float height;

    public preson(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void getInfo() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Height:" + this.height);
    }
}
