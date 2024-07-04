package mathmatic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int v = Integer.parseInt(st.nextToken());
    int dailyUp = a-b;

    for (int day = 1; dailyUp < v; day++) {
      dailyUp += a;
      if (dailyUp == v) {
        System.out.println(day);
        break;
      }
    }
  }
}
