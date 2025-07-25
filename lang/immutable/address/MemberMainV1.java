package lang.immutable.address;

public class MemberMainV1 {
  public static void main(String[] args) {
    Address address = new Address("서울");

    MemberV1 memberA = new MemberV1("회원A", address);
    MemberV1 memberB = new MemberV1("회원B", address);

    // 회원 A, B의 처음 주소는 모두 서울
    System.out.println("MemberA = " + memberA);
    System.out.println("MemberB = " + memberB);

    // 회원 B의 주소를 광주로 변경
    memberB.getAddress().setValue("광주");
    // memberA와 memberB는 같은 주소의 address 를 공유 중
    System.out.println("MemberA = " + memberA); // 광주
    System.out.println("MemberB = " + memberB); // 광주

  }
}
