package lang.string;

public class StringConcatMain {
  public static void main(String[] args) {
    String a = "hello";
    String b = " java";

    String result1 = a.concat(b);
    String result2 = a + b; // 참조값은 더할 수 없는데 이게 왜 되는걸까?

    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);

    // 자바에서 문자열을 더할 때는 원칙적으로 String이 제공하는 concat 메서드를 사용해야한다.
    // 하지만 문자열은 너무 자주 다루어지기 때문에 자바 언어에서 편의상 특별히 + 연산을 제공한다.
  }
}
