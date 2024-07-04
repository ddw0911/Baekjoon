package advanced_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] chess = {1, 1, 2, 2, 2, 8};
    int[] myCount = new int[6];
    int[] needMore = new int[6];
    for (int i = 0; i < myCount.length; i++) {
      myCount[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < myCount.length; i++) {
      needMore[i] = chess[i] - myCount[i];
      System.out.print(needMore[i]);
      if (i == myCount.length - 1) {
        break;
      }
      System.out.print(" ");
    }
  }
}
