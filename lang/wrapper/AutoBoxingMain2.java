package lang.wrapper;

public class AutoBoxingMain2 {
  public static void main(String[] args) { 

    // Primitive -> Wrapper
    int value = 10;
    Integer boxedValue = value; // auto-boxing
    System.out.println("boxedValue = " + boxedValue);

    // Wrapper -> Primitive
    int unboxedValue = boxedValue; // auto unboxing
    System.out.println("unboxedValue = " + unboxedValue);


  }
}
