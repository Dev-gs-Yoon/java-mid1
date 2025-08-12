package lang.string.chaining;

public class MethodChainingMain1 {
  public static void main(String[] args) {
    ValueAdder valueAdder = new ValueAdder();
    ValueAdder valueAdder1 = valueAdder.add(1);
    System.out.println("valueAdder1 = " + valueAdder1.getValue()); // 참조값이 같다
    ValueAdder valueAdder2 = valueAdder1.add(2);
    System.out.println("valueAdder2 = " + valueAdder2.getValue()); // 참조값이 같다
    ValueAdder valueAdder3 = valueAdder2.add(3);
    System.out.println("valueAdder3 = " + valueAdder3.getValue()); // 참조값이 같다

    int result = valueAdder3.getValue();
    System.out.println("result = " + result);
  }
}
