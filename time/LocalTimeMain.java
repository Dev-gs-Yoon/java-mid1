package time;

import java.time.LocalTime;

public class LocalTimeMain {
  public static void main(String[] args) {
    LocalTime nowTime = LocalTime.now();
    System.out.println("지금 시간 = " + nowTime);

    LocalTime ofTime = LocalTime.of(15, 30, 30);
    System.out.println("지정 시간 = " + ofTime);

    ofTime = ofTime.plusHours(1);
    System.out.println("ofTime = " + ofTime);

//    int getNowhour = nowTime.getHour();
//    System.out.println("getNowhour = " + getNowhour);
//
//    int getNowMinute = nowTime.getMinute();
//    System.out.println("getNowMinute = " + getNowMinute);
//
//    int getNowSecond = nowTime.getSecond();
//    System.out.println("getNowSecond = " + getNowSecond);
  }
}
