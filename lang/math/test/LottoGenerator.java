package lang.math.test;

import lang.object.Parent;

import java.util.Random;

public class LottoGenerator {
  private final int digit = 6; // 로또 번호 자리수
  private int count;
  private int[] lottoNumbers = new int[digit]; // 로또 번호 자리수 변수로 초기화
  private final Random random = new Random();

  public int[] generator(){
    count = 0;
    while (count < 6) {
      for (int i = 0; i < digit; i++) {
        int randomNumber = random.nextInt(45) + 1;
        if (isUnique(randomNumber, count)) {
          lottoNumbers[i] = randomNumber;
          count ++;
        }
      }
    }
    return lottoNumbers;
  }

  // 중복된 숫자가 아닌지 판단
  public boolean isUnique(int randomNumber, int count){
    for (int i = 0; i < count; i++) {
      if (randomNumber == lottoNumbers[i]) {
        return false;
      }
    }
    return true;
  }
}