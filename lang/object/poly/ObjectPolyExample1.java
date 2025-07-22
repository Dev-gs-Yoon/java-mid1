package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        // obj.sound 컴파일 오류 발생 Object클래스는 sound를 가지고 있지 않다.

        // 따라서 객체에 맞는 다운 캐스팅이 필요하다
        if ( obj instanceof Dog dog) {
            dog.sound();
            // ((Dog) obj).sound();
        } else if ( obj instanceof Car car) {
            car.move();
        }
    }
}
