package time;

import java.time.Duration;

public class DurationMain {
  public static void main(String[] args) {
    Duration duration = Duration.ofSeconds(30);
    System.out.println("시간 : " + duration);

    Duration duration1 = Duration.ofDays(23);
    System.out.println("시간 : " + duration1);

    System.out.println();

  }
}
