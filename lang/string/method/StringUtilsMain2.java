package lang.string.method;

public class StringUtilsMain2 {
  public static void main(String[] args) {

    int num = 100;
    boolean bool = true;
    String str = "Hello, java!";

    // format 메서드
    String format = String.format("num : %ox, boolean : %b, string : %s", num, bool, str);
    System.out.println("format = " + format);

    String format1 = String.format("%.2f", 10.123);
    System.out.println("format1 = " + format1);

    System.out.printf("%.2f\n", 12.1532);

  }
}
