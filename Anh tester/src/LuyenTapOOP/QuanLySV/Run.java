package LuyenTapOOP.QuanLySV;

public class Run {
  public static void main(String[] args) {
    NgaySinh ngay1 = new NgaySinh(20, 03, 1996);
    Lop lop1 = new Lop("DH01", "Công nghệ thông tin");
    SinhVien sv1 = new SinhVien(514,"Nguyễn Văn Phúc",ngay1,4.0,lop1);

    System.out.println("Khoa của sinh viên là: "+ sv1.layTenKhoa());
    System.out.println("Sinh viên có đạt điểm lơn hơn 5 hay không: "+ sv1.kiemTraDiem());
  }
}
