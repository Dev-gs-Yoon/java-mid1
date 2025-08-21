package lang.math;

import java.util.Arrays;
import java.util.Random;

public class RandomMain {
  public static void main(String[] args) {

    Random random = new Random();
//    Random seedRandom = new Random(1); // seed 값이 같으면 결과값이 같다.

    // random 수 출력
    int randomNum = random.nextInt();
    System.out.println("randomNum = " + randomNum);

    // 0 ~ 9까지 출력
    int randomRange1 = random.nextInt(10);
    System.out.println("0 ~ 9 = " + randomRange1);

    // 1 ~ 10까지 출력
    int randomRange2 = random.nextInt(10) + 1;
    System.out.println("1 ~ 10 = " + randomRange2);

    int[] secondSecurityNum = new int[6];
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < 6; i++) {
      secondSecurityNum[i] = random.nextInt(10);
      sb.append(random.nextInt(10));
    }
    System.out.println("secondSecurityNum = " + Arrays.toString(secondSecurityNum));
    System.out.println("sb = " + sb);
  }
}
