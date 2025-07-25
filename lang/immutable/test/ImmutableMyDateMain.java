package lang.immutable.test;

public class ImmutableMyDateMain {
  public static void main(String[] args) {

    ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
    ImmutableMyDate date2 = date1;

    System.out.println("date1 = " + date1); // 2024, 1, 1
    System.out.println("date2 = " + date2); // 2024, 1, 1

    System.out.println();

    System.out.println("2025 -> date2");
    date2 = date2.withYear(2025); // withYear는 인스턴스(객체)를 반환하므로 꼭 변수에 담아줘야함
    System.out.println("date1 = " + date1);
    System.out.println("date2 = " + date2);
  }
}
