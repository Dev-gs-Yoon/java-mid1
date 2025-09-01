package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
    AuthGrade authGrade = AuthGrade.valueOf(sc.nextLine().toUpperCase());
    System.out.println("당신의 등급은 " + authGrade.getDescription() + " 입니다.");

    print(authGrade);

  }

  private static void print(AuthGrade authGrade) {
    System.out.println("==메뉴 목록==");
    if (authGrade.getLevel() > 0) {
      System.out.println("- 메인 화면");
    }
    if(authGrade.getLevel() > 1){
      System.out.println("- 이메일 화면");
    }
    if (authGrade.getLevel() > 2){
      System.out.println("- 관리자 화면");
    }
  }
}
