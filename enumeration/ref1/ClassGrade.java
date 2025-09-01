package enumeration.ref1;

public class ClassGrade {
  // 상수
  private final int discountPercent;

  // 상수 선언 static final 딱 한번 생성
  // static을 사용하여 상수를 메서드 영역에 선언.
  // final을 이용하여 인스턴스(참조값)을 변경할 수 없도록 함.
  public static final ClassGrade BASIC = new ClassGrade(10);
  public static final ClassGrade GOLD = new ClassGrade(20);
  public static final ClassGrade DIAMOND = new ClassGrade(30);

  // private 생성자 추가

  private ClassGrade(int discountPercent) {
    this.discountPercent = discountPercent;
  }

  public int getDiscountPercent() {
    return discountPercent;
  }
}
