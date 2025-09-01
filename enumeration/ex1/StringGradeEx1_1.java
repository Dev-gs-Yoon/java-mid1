package enumeration.ex1;

public class StringGradeEx1_1 {
  public static void main(String[] args) {
    DiscountService discountService = new DiscountService();
    int price = 10000;
    int basic = discountService.discount(StringGrade.BASIC, price);
    int gold = discountService.discount(StringGrade.GOLD, price);
    int diamond = discountService.discount(StringGrade.DIAMOND, price);

    System.out.println("basic = " + (price - basic));
    System.out.println("gold = " + (price - gold));
    System.out.println("diamond = " + (price - diamond));
  }
}
