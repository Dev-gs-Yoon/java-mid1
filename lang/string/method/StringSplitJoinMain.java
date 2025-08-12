package lang.string.method;

import java.util.Scanner;

public class StringSplitJoinMain {
  public static void main(String[] args) {
    String str = "Apple,Banana,Orange";

    // split()
    String[] splitStr = str.split(",");
    for (String s : splitStr) {
      System.out.println("s = " + s);
    }

    // 새로운 방식
    String joinStr = String.join("-", splitStr);
    System.out.println("joinStr = " + joinStr);

    // 구식 방식
    String oldJoinStr = "";
    for (int i = 0; i < splitStr.length; i++) {
      String string = splitStr[i];
      oldJoinStr += string;

      if ( i != splitStr.length-1) {
        oldJoinStr += "-";
      }
    }
    System.out.println("oldJoinStr = " + oldJoinStr);
  }
}
