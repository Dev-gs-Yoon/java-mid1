package time;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
  public static void main(String[] args) {

    ZonedDateTime zdt = ZonedDateTime.now();
    System.out.println("zdt = " + zdt);

    LocalDateTime localDt = LocalDateTime.of(zdt.getYear(), zdt.getMonth(), zdt.getDayOfMonth(), 13, 20, 50);
//    LocalDateTime localDt = LocalDateTime.of(2030, 1, 2, 13, 20, 50);
    System.out.println("localDt = " + localDt);



  }
}
