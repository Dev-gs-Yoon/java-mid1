package lang.wrapper;

public class MyIntegerNullMain1 {
  public static void main(String[] args) {

    MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2), new MyInteger(3) };
    System.out.println(finalValue(intArr, -1));
    System.out.println(finalValue(intArr, 0));
    System.out.println(finalValue(intArr, 1));
    System.out.println(finalValue(intArr, 100));


  }
  private static MyInteger finalValue(MyInteger[] intArr, int target){
    for (MyInteger value : intArr) {
      if ( value.getValue() == target ) {
        return value;
      }
    }
    return  null;
  }
}
