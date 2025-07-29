package lang.string.equals;

public class StringEqualsMain1 {
  public static void main(String[] args) {

    String str1 = new String("hello"); // 인스턴스 생성 ex) x001
    String str2 = new String("hello"); // 인스턴스 생성 ex) x002
    System.out.println("new String() == 비교: " + (str1 == str2)); // false
    System.out.println("new String() equals 비교: " + (str1.equals(str2))); // true 이유: value 값으로 비교

    System.out.println();

    // String을 리터럴 방식으로 사용하면 자바는 메모리에 문자열 풀(String pool)을 만든다.
    // 같은 문자열이 있으면 또 다른 문자열 풀을 만들지 않는다.

    // 풀은 자원이 모여있는 곳을 의미 힙 영역을 사용

    String str3 = "hello"; // 인스턴스 생성 // 리터럴
    String str4 = "hello"; // 인스턴스 생성 // str3의 문자열 풀을 참조하게 된다.
    System.out.println("리터럴 비교: " + (str3 == str4)); // true
    System.out.println("리터럴 equals 비교: " + (str3.equals(str4))); // true
  }
}
