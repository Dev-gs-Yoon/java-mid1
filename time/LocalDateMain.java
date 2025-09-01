package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateMain {
  public static void main(String[] args) {

    LocalDate nowDate = LocalDate.now();
    System.out.println("nowDate = " + nowDate);
    LocalDate myDate = LocalDate.of(2025, 9, 1);
    System.out.println("myDate = " + myDate);

    // ofDate ( 불변 객체 )
    LocalDate plusedDate = myDate.plusDays(10);

    System.out.println(nowDate.plusDays(20));
    System.out.println("지정 날짜+10d = " + myDate );

    System.out.println("plusesDate = " + plusedDate);


  }
}
