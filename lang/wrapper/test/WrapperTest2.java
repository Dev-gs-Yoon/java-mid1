package lang.wrapper.test;

public class WrapperTest2 {
  public static void main(String[] args) {

    String[] array = new String[] {"1.5", "2.5", "3.5"};
    double result = 0;

    for (String a : array) {
       result += Double.parseDouble(a);
    }

    System.out.println("result = " + result);

  }
}
