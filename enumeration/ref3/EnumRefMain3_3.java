package enumeration.ref3;


import static enumeration.ref3.Grade.*;

public class EnumRefMain3_3 {
  public static void main(String[] args) {
    int price = 10000;

    printDiscountPrice(BASIC, price);
    printDiscountPrice(GOLD, price);
    printDiscountPrice(DIAMOND, price);
  }

  private static void printDiscountPrice(Grade grade, int price) {
    System.out.println(grade.toString().toLowerCase() + " = " + grade.discount(price));
//    System.out.println(grade.name().toLowerCase() + " = " + grade.discount(price));
  }

}
