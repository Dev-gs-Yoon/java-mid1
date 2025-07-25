package lang.immutable.change;

public class ImmutabaleMain1 {
  public static void main(String[] args) {
    ImmutableObj immutableObj = new ImmutableObj(10);
    ImmutableObj result = immutableObj.add(20);

    // 계산 이후에도 기존값과 모두 확인 가능
    System.out.println("immutableObj = " + immutableObj.getValue());
    System.out.println("immutableObj = " + result.getValue());
  }
}
