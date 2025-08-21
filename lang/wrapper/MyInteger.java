package lang.wrapper;

public class MyInteger {
  private final int value;

  public MyInteger(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public int compareTo(int num) {
    if (value > num){
      return 1;
    } else if (value < num) {
      return -1;
    } else {
      return 0;
    }
  }
}
