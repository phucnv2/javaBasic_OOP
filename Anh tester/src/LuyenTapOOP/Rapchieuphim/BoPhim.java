package LuyenTapOOP.Rapchieuphim;

public class BoPhim {
  private String tenBoPhim;
  private int namSX;
  private double giaVe;
  private HangSX hangSX;
  private NgayChieu ngayChieu;

  public BoPhim(String tenBoPhim, int namSX, double giaVe, HangSX hangSX, NgayChieu ngayChieu) {
    this.tenBoPhim = tenBoPhim;
    this.namSX = namSX;
    this.giaVe = giaVe;
    this.hangSX = hangSX;
    this.ngayChieu = ngayChieu;
  }

  public String getTenBoPhim() {
    return tenBoPhim;
  }

  public int getNamSX() {
    return namSX;
  }

  public double getGiaVe() {
    return giaVe;
  }

  public HangSX getHangSX() {
    return hangSX;
  }

  public NgayChieu getNgayChieu() {
    return ngayChieu;
  }

  public void setTenBoPhim(String tenBoPhim) {
    this.tenBoPhim = tenBoPhim;
  }

  public void setNamSX(int namSX) {
    this.namSX = namSX;
  }

  public void setGiaVe(double giaVe) {
    this.giaVe = giaVe;
  }

  public void setHangSX(HangSX hangSX) {
    this.hangSX = hangSX;
  }

  public void setNgayChieu(NgayChieu ngayChieu) {
    this.ngayChieu = ngayChieu;
  }
public boolean kiemTraGiaVe(BoPhim phimKhac){
    if (this.giaVe < phimKhac.giaVe){
      return true;
    }
    else {
      return false;
    }
}
public String inHangSX(){
    return this.hangSX.getTenHangSX();
}
public double giaKhuyenMai( double x){
    return this.giaVe*(1-x/100);
}
}
