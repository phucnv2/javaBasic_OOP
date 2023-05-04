package LuyenTapOOP.QuanLySach;

public class tacGia {
  private String tenTacGia;
  private date ngaySinh;

  public tacGia(String tenTacGia, date ngaySinh) {
    this.tenTacGia = tenTacGia;
    this.ngaySinh = ngaySinh;
  }

  public String getTenTacGia() {
    return tenTacGia;
  }

  public date getNgaySinh() {
    return ngaySinh;
  }

  public void setTenTacGia(String tenTacGia) {
    this.tenTacGia = tenTacGia;
  }

  public void setNgaySinh(date ngaySinh) {
    this.ngaySinh = ngaySinh;
  }
}
