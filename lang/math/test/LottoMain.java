package lang.math.test;

import java.util.Arrays;

public class LottoMain {
  public static void main(String[] args) {
    LottoGenerator lottoGenerator = new LottoGenerator();
    int[] lottoNumbers = lottoGenerator.generator();
    System.out.println("lottoNumbers = " + Arrays.toString(lottoNumbers));

  }
}
