package buoi5;

import java.util.ArrayList;

public class Learn_collection {
  public static void main(String[] args) {
    //ArryList
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("Phuc");
    arrayList.add("Phuc1");
    arrayList.add("Phuc2");
    arrayList.add("Phuc3");
    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println(arrayList.get(i));
    }
  }
}
