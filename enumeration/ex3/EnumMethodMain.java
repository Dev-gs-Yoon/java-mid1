package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
  public static void main(String[] args) {

    // 모든 ENUM 반환
    Grade[] values = Grade.values();
    System.out.println("values = " + Arrays.toString(values));
    // Arrays.toString()은 배열의 참조값이 아니라 배열 내부의 값을 출력할 때 사용

    for (Grade value : values) {
      // name 상수의 이름을 문자열로 반환
      // ordinal 상수의 선언 순서(0부터 시작)를 반환한다.
      System.out.println("name = " + value.name() + "ordinal = " + value.ordinal());
    }

    //String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
    String input = "GOLD";
    Grade gold = Grade.valueOf(input);
    System.out.println("gold = " + gold);

  }
}
