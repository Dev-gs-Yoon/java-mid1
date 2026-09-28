package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
  public static void main(String[] args) {

    for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
      // ZoneId.of(): 타임존을 직접 제공해서 ZoneId를 반환
      ZoneId zoneId = ZoneId.of(availableZoneId);
      System.out.println("zoneId = " + zoneId + zoneId.getRules());
    }

    // systemDefault() 시스템이 기본으로 사용하는 zoneId를 반환
    ZoneId zoneId = ZoneId.systemDefault();
    System.out.println("zoneId = " + zoneId);
  }
}
