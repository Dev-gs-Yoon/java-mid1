package enumeration.ex1;

public class StringGradeEx1_2 {
  public static void main(String[] args) {
    DiscountService discountService = new DiscountService();
    int price = 10000;
    // 존재하지 않는 등급
    int vip = discountService.discount("VIP", price);
    System.out.println("vip = " + (price - vip));

    // 오타의 경우
    int basic = discountService.discount("BASICC", price);
    System.out.println("basic = " + basic);

    // 소문자의 경우
    int gold = discountService.discount("gold", price);
    System.out.println("gold = " + gold);
  }
}
