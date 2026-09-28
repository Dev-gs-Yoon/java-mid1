package time.test;
public class Test {
  public static void main(String[] args) {
    int res1 = solution(">", "=", 20, 40);
    System.out.println(res1);

    int res2 = solution("<", "!", 41, 78);
    System.out.println(res2);
  }

  public static int solution(String ineq, String eq, int n, int m) {
    int answer = 0;

    if (ineq.equals(">")) {
      if(eq.equals("=")) {
        answer = n >= m? 1:0;
      } else {
        answer = n > m? 0:1;
      }
    } else {
      if(eq.equals("=")) {
        answer = n <= m? 1:0;
      } else {
        answer = n < m? 1:0;
      }
    }

    return answer;
  }
}