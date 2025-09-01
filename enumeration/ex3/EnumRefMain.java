package enumeration.ex3;

public class EnumRefMain {
  public static void main(String[] args) {

    // getClass(): 속한 클래스 정보 가져오기
    System.out.println("class Basic = " + Grade.BASIC.getClass());
    System.out.println("class Basic = " + Grade.GOLD.getClass());
    System.out.println("class Basic = " + Grade.DIAMOND.getClass());

    //
    System.out.println("ref = " + ref(Grade.BASIC));
    System.out.println("ref = " + ref(Grade.GOLD));
    System.out.println("ref = " + ref(Grade.DIAMOND));
  }

  private static String ref(Grade grade) {
    // Enum 타입의 파일은 toString()으로 오버라이딩 되어 있음
    // 그래서 아래와 같이 이용하여 참조값을 확인
    return Integer.toHexString(System.identityHashCode(grade));
  }
}
