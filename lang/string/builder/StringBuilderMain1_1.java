package lang.string.builder;

public class StringBuilderMain1_1 {
  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder();

    sb.append("A");
    sb.append("B");
    sb.append("C");
    sb.append("D");
    System.out.println("sb = " + sb);

    // 문자열 삽입 insert
    sb.insert(4, " Java");
    System.out.println("insert = " + sb);

    // 문자열 삭제 delete
    sb.delete(4, 9);
    System.out.println("delete = " + sb);

    // 문자열 전환
    sb.reverse();
    System.out.println("reverse  = " + sb);

    String string = sb.toString();
    System.out.println("string = " + string);
  }
}
