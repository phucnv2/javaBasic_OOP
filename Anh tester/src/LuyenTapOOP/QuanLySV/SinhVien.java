package LuyenTapOOP.QuanLySV;

public class SinhVien {
  private int maSoSV;
  private String hoTen;
  private NgaySinh ngayThang;
  private double diemTrungBinh;
  private Lop lop;

  public SinhVien(int maSoSV, String hoTen, NgaySinh ngayThang, double diemTrungBinh, Lop lop) {
    this.maSoSV = maSoSV;
    this.hoTen = hoTen;
    this.ngayThang = ngayThang;
    this.diemTrungBinh = diemTrungBinh;
    this.lop = lop;
  }

  public int getMaSoSV() {
    return maSoSV;
  }

  public void setMaSoSV(int maSoSV) {
    this.maSoSV = maSoSV;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public NgaySinh getNgayThang() {
    return ngayThang;
  }

  public void setNgayThang(NgaySinh ngayThang) {
    this.ngayThang = ngayThang;
  }

  public double getDiemTrungBinh() {
    return diemTrungBinh;
  }

  public void setDiemTrungBinh(double diemTrungBinh) {
    this.diemTrungBinh = diemTrungBinh;
  }

  public Lop getLop() {
    return lop;
  }

  public void setLop(Lop lop) {
    this.lop = lop;
  }

  public String layTenKhoa() {
    return this.lop.getTenKhoa();
  }

  public boolean kiemTraDiem() {
    if (this.diemTrungBinh > 5) {
      return true;
    } else {
      return false;
    }
  }
}
