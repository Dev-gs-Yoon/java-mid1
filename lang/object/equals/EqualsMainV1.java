package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        /*
          메모리 상에서 userV1과 userV2는 당연히 서로 다른 인스턴스로 메모리상에 저장된다.
          동일성을 비교하는 연산을 하게 되면 서로 다른 인스턴스이고 참조값이 다르므로 false 를 반환한다.
        */
        System.out.println("Identity = " + (userV1 == userV2));

        // 동등성 비교 : false
        System.out.println("Equality = " + userV1.equals(userV2));
    }
}
