package learnCoder.bai3;

public class Student {
    private String name,gender;
    private int age;
    private double gpa;

    public Student(String name, String gender, int age, double gpa) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.gpa = gpa;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Student st = new Student("Phucs","Nam",30,9.5);
        st.display();
    }
}
