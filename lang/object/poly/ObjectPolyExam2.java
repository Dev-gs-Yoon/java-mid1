package lang.object.poly;

public class ObjectPolyExam2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object obj = new Object(); // Object인스턴스 생성

        Object[] objects = { dog, car, obj };
        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }


}
