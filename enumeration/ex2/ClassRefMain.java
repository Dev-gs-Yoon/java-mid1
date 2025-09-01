package enumeration.ex2;

public class ClassRefMain {
  public static void main(String[] args) {
    System.out.println("ClassBasic = " + ClassGrade.BASIC.getClass());
    System.out.println("ClassGold = " + ClassGrade.GOLD.getClass());
    System.out.println("ClassDiamond = " + ClassGrade.DIAMOND.getClass());

    System.out.println("refBasic = " + ClassGrade.BASIC); // 참조값 출력
    System.out.println("refGold = " + ClassGrade.GOLD); // 참조값 출력
    System.out.println("refDiamond = " + ClassGrade.DIAMOND); // 참조값 출력
  }
}
