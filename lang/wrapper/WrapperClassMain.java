package lang.wrapper;

public class WrapperClassMain {
  public static void main(String[] args) {

//    Integer integer = new Integer(10); // deprecated 곧 삭제 예정 valueOf() 사용
    Integer integer1 = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변임
    Long longOnj = Long.valueOf(1220202020);
//    System.out.println("integer = " + integer);
    System.out.println("integer1 = " + integer1); 
  }
}
