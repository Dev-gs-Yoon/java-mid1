package time.study;

import time.InstantMain;

import java.util.ArrayList;

class P {
  public P(){
    System.out.println("1");
    display();
  }

  public void display(){
    System.out.println("Super");
  }
}

//class C extends P {
//  private String info = "Child Info";
//  private int count = 100;
//  public C(){
//    System.out.println("2");
//  }
//
//  public void display(){
//    System.out.println(info);
//    System.out.println(count);
//  }
//}

class CM {
  public static CM manager = null;
  private int value;

  public CM() {

  }

  public static CM getManager() {
    if (manager == null) {
      manager = new CM();
    }
    return manager;
  }

  public void setValue() {
    value++;
  }

  public int getValue() {
    return value;
  }
}

public class Csa {
  public static void main(String[] args) {
//    CM c1 = CM.getManager();
//    CM c2 = CM.getManager();
//    c1.setValue();
//    c1.setValue();
//    c2.setValue();
//    System.out.println(c1.getValue());
//    System.out.println(c2.getValue());
//    System.out.println(c1.manager);

    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(5);
    nums.add(10);
    nums.add(15);


  }
}
