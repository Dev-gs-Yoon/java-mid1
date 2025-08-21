package lang.math;

public class MathMain {
  public static void main(String[] args) {

    // 기본 연산 메서드
    System.out.println("Math.max = "+ Math.max(10, 20));
    System.out.println("Math.min = "+ Math.min(10, 20));
    System.out.println("Math.abs = "+ Math.abs(-20));

    // 반올림, 정밀도 메서드
    System.out.println("Math.ceil = " + Math.ceil(2.12)); // 올림
    System.out.println("Math.floor = " + Math.floor(2.92)); // 내림
    System.out.println("Math.round = " + Math.round(2.49)); // 반올림

    // 기타 유용한 메서드
    System.out.println("Math.sqrt = " + Math.sqrt(4)); // 제곱근
    System.out.println("Math.random = " + Math.random()); // 0.0 ~ 1.0 사이의 double 값 반환



  }
}
