package LuyenTapOOP.QuanLySach;

public class Run {
  public static void main(String[] args) {
    date ngay1 = new date(01, 05, 2022);
    date ngay2 = new date(02, 05, 2022);
    date ngay3 = new date(03, 05, 2022);

    tacGia tg1 = new tacGia("Nguyen Van Phuc", ngay1);
    tacGia tg2 = new tacGia("Tran Van Huy", ngay2);
    tacGia tg3 = new tacGia("Ngo Duy Kien", ngay3);

    sach sach1 = new sach("Sach cua tac gia Nguyen Van Phuc", 5000, 2000, tg1);
    sach sach2 = new sach("Sach cua tac gia Tran Van Huy", 10000, 2001, tg2);
    sach sach3 = new sach("Sach cua tac gia Ngo Duy Kien", 20000, 2000, tg3);

    sach1.inTenSach();

    System.out.println("so sánh sách 1 và 3: "+ sach1.kienTraNamXB(sach3));
    System.out.println("Sách 1 giảm 10%: " +sach1.giaSales(10));
    System.out.println("Sách 2 giảm 20%: " +sach2.giaSales(20));
    System.out.println("Sách 3 giảm 50%: " +sach3.giaSales(50));
  }
}
