package LuyenTapOOP.QuanLySach;

public class sach {
  private String tenSach;
  private double giaBan;
  private int namSanXuat;
  private tacGia tacGia;

  public sach(String tenSach, double giaBan, int namSanXuat, LuyenTapOOP.QuanLySach.tacGia tacGia) {
    this.tenSach = tenSach;
    this.giaBan = giaBan;
    this.namSanXuat = namSanXuat;
    this.tacGia = tacGia;
  }

  public String getTenSach() {
    return tenSach;
  }

  public double getGiaBan() {
    return giaBan;
  }

  public int getNamSanXuat() {
    return namSanXuat;
  }

  public tacGia getTacGia() {
    return tacGia;
  }

  public void setTenSach(String tenSach) {
    this.tenSach = tenSach;
  }

  public void setGiaBan(double giaBan) {
    this.giaBan = giaBan;
  }

  public void setNamSanXuat(int namSanXuat) {
    this.namSanXuat = namSanXuat;
  }

  public void setTacGia(tacGia tacGia) {
    this.tacGia = tacGia;
  }
  public void inTenSach() {
    System.out.println(this.tenSach);
  }
//  public void inAll() {
//    System.out.println("Sách "+this.tenSach +" đang bán với giá là: "+ this.giaBan + " VND. Của tác giả " + this.tacGia+" và sản xuất năm " +this.namSanXuat);
//  }
  public boolean kienTraNamXB(sach sachKhac){
    if (this.namSanXuat == sachKhac.namSanXuat){
      return true;
    }
    else {
      return false;
    }
  }
  public double giaSales(double x){
    double giaSale = this.giaBan*(1-x/100);
    return giaSale;
  }
}
