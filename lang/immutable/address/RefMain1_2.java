package lang.immutable.address;

public class RefMain1_2 {
  public static void main(String[] args) {
    // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
    Address a = new Address("서울");
    Address b = new Address("서울");

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    b.setValue("광주");
    System.out.println("a = " + a);
    System.out.println("b = " + b);


  }
}
