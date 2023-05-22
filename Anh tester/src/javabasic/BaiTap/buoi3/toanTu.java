package javabasic.BaiTap.buoi3;

import java.util.Scanner;

public class toanTu {
  double diemToan, diemVan, diemAnh;
  double diemGioi = 8;
  Scanner sc = new Scanner(System.in);

  public void toanTuQuanHe() {
    if (diemToan >= diemGioi && diemVan >= diemGioi && diemAnh >= diemGioi) {
      System.out.println("Ban la hoc sinh gioi toan dien 3 mon Toan, Van, Anh!");
    } else if (diemToan >= diemGioi || diemVan >= diemGioi || diemAnh >= diemGioi) {
      System.out.println("Ban chua la hoc sinh gioi 3 mon Toan, Van, Anh. Ban can cai thien them!");
    } else {
      System.out.println("Ban nhap linh tinh roi!");
    }
  }
  public void show(){
    System.out.println("Xin moi nhap diem Toan: ");
    diemToan = sc.nextInt();
    System.out.println("Xin moi nhap diem Van: ");
    diemVan = sc.nextInt();
    System.out.println("Xin moi nhap diem Anh: ");
    diemAnh = sc.nextInt();
  }

  public static void main(String[] args) {
    toanTu tt = new toanTu();
    tt.show();
    tt.toanTuQuanHe();

  }
}
