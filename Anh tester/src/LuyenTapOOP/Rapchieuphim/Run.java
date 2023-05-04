package LuyenTapOOP.Rapchieuphim;

public class Run {
  public static void main(String[] args) {

    NgayChieu ngay = new NgayChieu(31,01,2023);
    HangSX hangSX = new HangSX("VB","Việt Nam");
    BoPhim bphim = new BoPhim("Thần điêu đại hiệp",2005,150000,hangSX,ngay);

    NgayChieu ngay1 = new NgayChieu(31,01,2023);
    HangSX hangSX1 = new HangSX("VB","Việt Nam");
    BoPhim bphim1 = new BoPhim("Thần điêu đại hiệp v1",2006,100000,hangSX1,ngay1);

    NgayChieu ngay2 = new NgayChieu(31,01,2023);
    HangSX hangSX2 = new HangSX("VB","Việt Nam");
    BoPhim bphim2 = new BoPhim("Thần điêu đại hiệp v2",2005,150000,hangSX2,ngay2);


    System.out.println("Check gia vé phim 1 và phim 2 "+ bphim.kiemTraGiaVe(bphim1));
    System.out.println("Tên hãng sản xuất tên bộ phim là: "+bphim1.inHangSX());
    System.out.println("Giá vé sau khi giảm là: "+bphim2.giaKhuyenMai(50));

  }
}
