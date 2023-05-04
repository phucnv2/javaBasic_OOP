package LuyenTapOOP.Rapchieuphim;

public class HangSX {
  private String tenHangSX;
  private String quocGia;

  public HangSX(String tenHangSX, String quocGia) {
    this.tenHangSX = tenHangSX;
    this.quocGia = quocGia;
  }

  public String getTenHangSX() {
    return tenHangSX;
  }

  public String getQuocGia() {
    return quocGia;
  }

  public void setTenHangSX(String tenHangSX) {
    this.tenHangSX = tenHangSX;
  }

  public void setQuocGia(String quocGia) {
    this.quocGia = quocGia;
  }
}
