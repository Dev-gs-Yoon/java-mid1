package lang.immutable.address;

public class RefMain2 {
  public static void main(String[] args) {
    // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
    ImmutableAddress a = new ImmutableAddress("서울");
    // 참조값 대입을 막을 수 있는 방법이 없다. 자바 문법상 문제가 없다.
    ImmutableAddress b = a;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    // b.setValue("광주");
    // b의 값을 광주로 변경해야한다?
    b = new ImmutableAddress("광주");
    System.out.println("서울 -> b");
    System.out.println("a = " + a);
    System.out.println("b = " + b);


  }
}
