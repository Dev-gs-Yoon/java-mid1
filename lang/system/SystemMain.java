package lang.system;

import lang.string.method.StringSearchMain;

import javax.swing.text.Style;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SystemMain {
  public static void main(String[] args) {

    // 밀리 초
    long milliTime = System.currentTimeMillis();
    System.out.println("milliTime = " + milliTime);

    // 나노 초
    long nanoTime = System.nanoTime();
    System.out.println("nanoTime = " + nanoTime);

    // 환경 변수
    System.out.println("getenv = " + System.getenv());

    // 시스템 속성 읽기
    System.out.println("properties = " + System.getProperties());
    System.out.println("java version = " + System.getProperty("java.version"));

    // 배열을 고속으로 복사하기 -> 자바가 아닌 운영체제에 배열을 넘겨서 빠르게 복사 보통 2~5배 빠름
    char[] originalArray = new char[] {'h', 'e', 'l', 'l', 'o'};
    char[] copiedArray = new char[5];

    long startTime = System.currentTimeMillis();
    System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
    long endTime = System.currentTimeMillis();

    System.out.println("copiedArray = " + Arrays.toString(copiedArray));
    System.out.println("operationTime = " + (endTime-startTime) + "ms");

//    char[] copiedArray2 = new char[5];
//
//    startTime = System.currentTimeMillis();
//    for (int i = 0; i < originalArray.length; i++) {
//      copiedArray2[i] = originalArray[i];
//    }
//    endTime = System.currentTimeMillis();
//    System.out.println("operationTime2 = " + (endTime - startTime) + "ms");
//
//    System.out.println("copiedArray2 = " + Arrays.toString(copiedArray2));
  }
}
