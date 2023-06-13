package learnCoder.bai3;

import java.util.Scanner;

public class Rectangle {

    double length, width;

    public void getInfomation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin moi nhap chieu dai: ");
        length = sc.nextDouble();
        System.out.println("Xin moi nhap chieu rong: ");
        width = sc.nextDouble();
    }

    public double getArea() {
        double Area = length * width;
        return Area;
    }

    public double getPerimeter() {
        double Perimeter = (length + width) * 2;
        return Perimeter;
    }

    public void display() {
        System.out.println("Dien hinh chu nhat la: " + getArea());
        System.out.println("Chu vi hinh chu nhat la: " + getPerimeter());
    }


    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getInfomation();
        r.display();
    }

}
