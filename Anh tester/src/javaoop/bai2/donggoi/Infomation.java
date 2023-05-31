package javaoop.bai2.donggoi;

public class Infomation {
    public static void main(String[] args) {
        Student st = new Student("Phuc",10,90);
        System.out.println(st.getName());
        st.setName("Hoa");
        System.out.println(st.getName());
    }
}
