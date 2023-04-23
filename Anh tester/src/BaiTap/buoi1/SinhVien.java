package BaiTap.buoi1;

import java.util.Scanner;

public class SinhVien {
  public String queQuan = "Nghệ An";
  public void SinhVien(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào tên của bạn: ");
    String hoTen = sc.nextLine();
    System.out.println("Mời nhập vào tuổi của bạn: ");
    int tuoi = sc.nextInt();
    System.out.println("Tôi là: "+hoTen+". Tôi "+tuoi+" tuổi");
  }
  public void showThongTin(){
    System.out.println("Tôi đến từ "+queQuan);
  }
  public static void main(String[] args) {
    SinhVien sv = new SinhVien();
    sv.SinhVien();
    sv.showThongTin();
    System.out.println("Đang học trường: " +ThongTin.universeName);
  }

}
