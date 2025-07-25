package lang.immutable.address;

public class MemberMainV2 {
  public static void main(String[] args) {
    ImmutableAddress address = new ImmutableAddress("서울");

    MemberV2 memberA = new MemberV2("회원A", address);
    MemberV2 memberB = new MemberV2("회원B", address);

    // 회원 A, B의 처음 주소는 모두 서울
    System.out.println("MemberA = " + memberA);
    System.out.println("MemberB = " + memberB);

    // 회원 B의 주소를 광주로 변경
    memberB.setAddress(new ImmutableAddress("광주"));
    System.out.println("광주 -> memberB.address");
    System.out.println("MemberA = " + memberA);
    System.out.println("MemberB = " + memberB);
  }
}
