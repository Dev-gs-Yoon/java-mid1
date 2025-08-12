package lang.string.builder;

public class StringBuilderMain1_2 {
  public static void main(String[] args) {

    StringBuilder sb = new StringBuilder();

    sb.append("A").append("B").append("C").append("D");
    System.out.println("sb = " + sb);

    // 문자열 삽입 insert
    String string = sb.insert(4, " Java").delete(4, 9).reverse().toString();
    System.out.println("string = " + string);
  }
}
