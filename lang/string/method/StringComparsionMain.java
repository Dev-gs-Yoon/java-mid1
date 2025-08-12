package lang.string.method;

public class StringComparsionMain {
  public static void main(String[] args) {
    String str1 = "Hello, Java"; // 대문자 포함
    String str2 = "hello, java"; // 소문자
    String str3 = "Hello, World";

    System.out.println("str1 equals str2" + str1.equals(str2));
    System.out.println("str1 equalsIgnoreCase str2 " + str1.equalsIgnoreCase(str2));

    System.out.println("'b' compareTo 'a' : " + "b".compareTo("a")); // 사전적 위치를 정수형으로 알려줌
    System.out.println("str1 compareTo str3 : " + str1.compareTo(str2)); // 사전적 위치를 정수형으로 알려줌
    System.out.println("str1 compareToIgnoreCase str2 : " + str1.compareToIgnoreCase(str2)); // 사전적 위치를 정수형으로 알려줌

    System.out.println("str1 starts with 'Hello' : " + str1.startsWith("Hello")); // boolean
    System.out.println("str1 ends with 'Java' : " + str1.endsWith("Java")); // boolean

  }
}
