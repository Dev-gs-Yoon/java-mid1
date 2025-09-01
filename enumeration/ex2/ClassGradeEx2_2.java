package enumeration.ex2;

public class ClassGradeEx2_2 {
  public static void main(String[] args) {
    int price = 10000;

    DiscountService discountService = new DiscountService();
//    ClassGrade classGrade = new ClassGrade();
    // dicount의 매개변수를 확인했을 때 ClassGrade타입이 있기 때문에 생성자를 이용해서 변수값을 넣게되면 의도한채로 안됨
    // 외부에서 ClassGrade를 생성할 수 없게 private으로 지정
    int result = discountService.discount(ClassGrade.BASIC, price);

    System.out.println("result = " + result);


  }
}
