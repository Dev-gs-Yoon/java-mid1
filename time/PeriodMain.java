package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PeriodMain {
  public static void main(String[] args) {
    // 생성
    Period period = Period.ofDays(10);
    System.out.println("period = " + period);

    // 계산에 사용
    LocalDate currentDate = LocalDate.of(2030, 1, 1);
    LocalDate plusDate = currentDate.plus(period);
    System.out.println("currentDate = " + currentDate);
    System.out.println("plusDate = " + plusDate);

    System.out.println();

    // 기간 차이
    LocalDate startDate = LocalDate.of(2023, 1, 1);
    LocalDate endDate = LocalDate.of(2023, 4, 2);
    Period betweenDate = Period.between(startDate, endDate);
    System.out.println("startDate = " + startDate);
    System.out.println("endDate = " + endDate);
    System.out.println("betweenDate = " + betweenDate);

    System.out.println(betweenDate.getMonths() + "개월 " + betweenDate.getDays() + "일");
  }
}
