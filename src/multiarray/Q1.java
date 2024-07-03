package multiarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int input1 = Integer.parseInt(st.nextToken());
    int input2 = Integer.parseInt(st.nextToken());

    int[][] a = new int[input1][input2];
    int[][] b = new int[input1][input2];

    for (int i = 0; i < a.length; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < b.length; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < b[i].length; j++) {
        b[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < input1; i++) {
      for (int j = 0; j < input2; j++) {
        System.out.print(a[i][j] + b[i][j] + " ");
      }
      System.out.println();
    }
  }
}
