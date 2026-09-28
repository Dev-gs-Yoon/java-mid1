package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
  public static void main(String[] args) {

    // 기계식 시간 1970년 1월 1일 0시 0분 기준
    Instant now = Instant.now(); // UTC기준
    System.out.println("now = " + now);

    ZonedDateTime zdt = ZonedDateTime.now();
    System.out.println("zdt = " + zdt);

    // from을 이용해서 ZonedDateTime을 Instant로 변환 가능
    Instant from = Instant.from(zdt);
    System.out.println("from = " + from);

    Instant epochStart = Instant.ofEpochSecond(3600);
    System.out.println("epochStart = " + epochStart);

    // 계산
    Instant later = epochStart.plusSeconds(3600);
    System.out.println("later = " + later);

    // 조회
    Long laterEpochSecond = later.getEpochSecond();
    System.out.println("laterEpochSecond = " + laterEpochSecond);


  }
}
