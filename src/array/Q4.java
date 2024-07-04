package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {

  // 2562
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] num = new int[9];

    for (int i = 0; i < num.length; i++) {
      num[i] += Integer.parseInt(br.readLine());
    }

    int max = num[0];

    for (int i = 0; i < num.length; i++) {
      max = Math.max(max, num[i]);
    }
    System.out.println(max);
    for (int i = 0; i < num.length; i++) {
      if (num[i] == max) {
        System.out.print(i+1);
      }
    }
  }
}

