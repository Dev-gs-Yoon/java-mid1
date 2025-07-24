package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        // 동일성 비교 : 서로 다른 인스턴스 이므로 false
        System.out.println("Identity = " + (user1 == user2));

        // 동등성 비교 : true
        System.out.println("Equality = " + user1.equals(user2));
    }
}
