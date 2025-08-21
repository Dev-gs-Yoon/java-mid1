package lang.wrapper;

public class WrapperUtilsMain {
  public static void main(String[] args) {

    Integer i1 = Integer.valueOf(10); // 숫자를 객체로 변환
    Integer i2 = Integer.valueOf("10"); // 문자열을 객체로 변환
    int i3 = Integer.parseInt("10"); // 문자열을 기본형으로 변환

    // 비교
    int compareResult = i1.compareTo(20); // 1, 0, -1 반환
    System.out.println("compareResult = " + compareResult);

    // 산술 연산
    System.out.println("sum : " + Integer.sum(i1, 20));
    System.out.println("min : " + Integer.min(i1 , 20));
    System.out.println("max : " + Integer.max(i1, 20));
  }
}
