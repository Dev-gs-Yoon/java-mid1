package lang.wrapper;

public class AutoBoxingMain1 {
  public static void main(String[] args) {

    // Primitive -> Wrapper
    int value = 10;
    Integer integer = Integer.valueOf(value);
    System.out.println("integer = " + integer);

    // Wrapper -> Primitive
    int i = integer.intValue();
    System.out.println("i = " + i);

  }
}
