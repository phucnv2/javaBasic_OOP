package buoi5;

import java.util.ArrayList;

public class LearnArrayList {
  public static void main(String[] args) {
    // khai bao array list
    ArrayList<String> list = new ArrayList<String>();
    // thêm phần tử zô array list
    list.add("Selenium");
    list.add("Test NG");
    list.add("Selenium");
    list.add("Phuc");
    list.add(1,"Nguyen"); // thêm từ chỉ mục_index

    // duyệt array list
    for (int i =1;i<list.size();i++) {
      System.out.println(list.get(i));
    }
  }
}
