package enumeration.ex2;

public class ClassGrade {
  // 상수 선언 static final 딱 한번 생성
  // static을 사용하여 상수를 메서드 영역에 선언.
  // final을 이용하여 인스턴스(참조값)을 변경할 수 없도록 함.
  public static final ClassGrade BASIC = new ClassGrade();
  public static final ClassGrade GOLD = new ClassGrade();
  public static final ClassGrade DIAMOND = new ClassGrade();

  // private 생성자 추가

  private ClassGrade() {

  }
}
