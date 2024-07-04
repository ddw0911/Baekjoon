package firstdarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1 {
  //10807번
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int total = Integer.parseInt(br.readLine());
    int[] nums = new int[total];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }

    int v = Integer.parseInt(br.readLine());
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == v) {
        count++;
      }
    }
    System.out.print(count);
  }
}
