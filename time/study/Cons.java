package time.study;

class A {
  int value = 10;
  A(){
    printValue();
  }

  public void printValue(){
    System.out.println(value + " ");
  }
}

class B extends A {
  int value = 20;
  B(){
    super();
    value += 10;
    printValue();
  }

  public void printValue(){
    System.out.println(value + " ");
  }
}

class C extends B {
  int value = 30;

  C() {
    super();
    value += 10;
    printValue();
  }

  public void printValue(){
    System.out.println(value + " ");
  }
}
public class Cons {
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.println(obj1.value);
    A obj2 = new B();
    System.out.println(obj2.value);
    A obj3 = new C();
    System.out.println(obj3.value);
  }
}
