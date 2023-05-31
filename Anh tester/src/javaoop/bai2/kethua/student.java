package javaoop.bai2.kethua;

public class student extends preson {
    public String address;

    public student(String name, int age, float height, String address) {
        super(name, age, height);
        this.address = address;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(this.address);
    }

    public static void main(String[] args) {
        student st = new student("Phúc", 10, 170, "Nghệ An");
        st.getInfo();
    }
}
