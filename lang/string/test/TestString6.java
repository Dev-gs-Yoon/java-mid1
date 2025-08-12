package lang.string.test;

public class TestString6 {
  public static void main(String[] args) {
    String str = "start hello java, hello spring, hello jpa";
    String key = "hello";

    int count = 0;
    int index = str.indexOf(key); // 결과 : 6

    while (index >= 0) {
      index = str.indexOf(key, index + 1); // hello를 찾을 건데 7번 인덱스부터
      count += 1;
    }

    System.out.println("count = " + count);
  }
}
