package lang.string.immutable;

public class StringImmutable2 {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = str1.concat(" java");
    System.out.println("str1 = " + str1); // hello
    System.out.println("str2 = " + str2); // hello java

    // concat()은 내부에서 String 객체를 만들어서 반환한다. 따라서 불변과 기존 객체의 값을 유지A한다.

    // String이 불변으로 설계된 이유
    // 1. 사이드 이펙트 방지
    // 2. 문자열 풀에 있는 String 인스턴스의 값이 변경되면 같은 문자열을 참고하는 다른 변수의 값도 함꼐 변경된다.
  }
}
