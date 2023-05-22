package javaoop.baitapjavaoop.buoi1;

public class Run extends NhanVien{
    public Run(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        NhanVien nv = new NhanVien("Phuc",30);
        nv.setAge(40);
        nv.display();
    }
}
