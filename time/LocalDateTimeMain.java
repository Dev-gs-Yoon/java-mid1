package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
  public static void main(String[] args) {
    LocalDateTime nowDt = LocalDateTime.now();
    System.out.println("현재 날짜시간 = " + nowDt);
    LocalDateTime ofDt = LocalDateTime.of(2017, 5, 28, 12, 25, 11);
    System.out.println("지정 날짜시간 = " + ofDt);

    System.out.println();

    // 날짜와 시간 분리하기
    LocalDate localDate = nowDt.toLocalDate();
    System.out.println("localDate = " + localDate);
    LocalTime localTime = nowDt.toLocalTime();
    System.out.println("localTime = " + localTime);

    System.out.println();

    // 날짜와 시간 합치기
    LocalDateTime newLocalDt = LocalDateTime.of(localDate, localTime);
    System.out.println("newLocalDt = " + newLocalDt);

    // 날짜 계산하기
    LocalDateTime plusedDate = nowDt.plusDays(1000);
    System.out.println("plusedDate = " + plusedDate);

    // 이전 이후 비교하기
    boolean isBefore = nowDt.isBefore(ofDt);
    System.out.println("isBefore = " + isBefore);
    
    boolean isAfter = nowDt.isAfter(ofDt);
    System.out.println("isAfter = " + isAfter);

    // 비교되는 날짜가 서로 같은가?
    System.out.println("same = " + nowDt.isEqual(ofDt));

  }
}
