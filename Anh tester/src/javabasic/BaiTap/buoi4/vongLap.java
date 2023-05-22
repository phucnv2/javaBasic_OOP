package javabasic.BaiTap.buoi4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vongLap {
  int n;
  Scanner sc = new Scanner(System.in);
  int arr[];

  public void vongLapFor() {
    System.out.println("Nhap vao so phan tu: ");
    n = sc.nextInt();
    List a = new ArrayList();
      for (int i = 1; i <= n; i = i + 2) {
        if (n%2==0){
        System.out.println(i+1);
        a.add(i+1);
      }
    }
    System.out.print(a);
  }
  public void vongLapFore() {
    System.out.println("Nhap vao so phan tu: ");
    n = sc.nextInt();
    int arr[];
  }
  public static void main(String[] args) {
    vongLap vl = new vongLap();
    vl.vongLapFor();
  }
}
