package BaiTap.buoi2;

public class Basic2 {

  public double soThuNhat, soThuHai;

  public double tinhTong(double soThuNhat, double soThuHai) {
    this.soThuNhat = soThuNhat;
    this.soThuHai = soThuHai;
    return soThuNhat + soThuHai;
  }
  public double tinhTich(double soThuNhat, double soThuHai) {
    this.soThuNhat = soThuNhat;
    this.soThuHai = soThuHai;
    return soThuNhat * soThuHai;
  }

  public void hienThiThongTin() {
    System.out.println(tinhTong(3, 3));
    System.out.println(tinhTich(4, 3));
  }

  public static void main(String[] args) {
    Basic2 b1 = new Basic2();
    b1.hienThiThongTin();
//    System.out.println(b1.tinhTong(1,3));
//    System.out.println(b1.tinhTong(1,3));
  }
}
