package enumeration.ref3;

public class EnumRefMain3_4 {
  public static void main(String[] args) {
    int price = 10000;

    // 모든 ENUM 반환 .values()
    Grade[] grades = Grade.values();

    for (Grade grade : grades) {
      printDiscountPrice(grade, price);
    }
  }

  private static void printDiscountPrice(Grade grade, int price) {
    System.out.println(grade.toString().toLowerCase() + " = " + grade.discount(price));
//    System.out.println(grade.name().toLowerCase() + " = " + grade.discount(price));
  }

}
