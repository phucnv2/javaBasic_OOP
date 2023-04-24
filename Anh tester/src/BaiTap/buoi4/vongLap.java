package BaiTap.buoi4;

import java.util.Scanner;

public class vongLap {
  int n;
  Scanner sc = new Scanner(System.in);
  int arr[];

  public void vongLapFor() {
    System.out.println("Nhap vao so phan tu: ");
    n = sc.nextInt();
    for (int i = 1; i < n; i = i + 2) {
      System.out.println(i+1);
    }
  }

  public static void main(String[] args) {
    vongLap vl = new vongLap();
    vl.vongLapFor();
  }
}
