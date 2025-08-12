package lang.string.method;

public class ChangeMain1 {
  public static void main(String[] args) {

    String str = "Hello, Java! Welcome to Java";

    System.out.println("인덱스 7번부터 부분 문자열 : " + str.substring(10));
    System.out.println("인덱스 7번부터 12번까지 부분 문자열 : " + str.substring(7, 12));

    System.out.println("문자열 결합 : " + str.concat(" world"));
    System.out.println("'Java'를 'world'로 대체 : " + str.replace("Java", "world"));

    System.out.println("첫 번째 'Java'를 'World'로 대체 : " + str.replaceFirst("Java", "World"));
  }
}
