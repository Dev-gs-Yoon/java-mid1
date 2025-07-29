package lang.string.equals;

public class StringEqualsMain2 {
  public static void main(String[] args) {

    String str1 = new String("hello");
    String str2 = new String("hello");

    System.out.println("메서드 호출 비교1: " + isSame(str1, str2)); // false

    String str3 = "hello";
    String str4 = "hello";
    System.out.println("메서드 호출 비교2: " + isSame(str3, str4)); // true
  }

  private static boolean isSame(String x, String y) {
    // 문자열을 비교하는 isSame 개발자 입장에서 파라미터 값이 new String 일지 리터럴일지 알 수 없으므로
    // 문자열 비교는 항상 == 이 아니라 .equals()를 사용해야 한다.
    // return x == y;
    return x.equals(y);
  }
}
