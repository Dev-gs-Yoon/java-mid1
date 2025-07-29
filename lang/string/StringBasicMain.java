package lang.string;

public class StringBasicMain {
  public static void main(String[] args) {

    String str1 = "hello";
    String str2 = new String("hello");

    // String은 기본형이 아니라 참조형이다.
    System.out.println("str1 = " + str1);
    System.out.println("str2 = " + str2);
  }
}
