package multiarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[][] table = new int[9][9];
    int max = table[0][0];
    int maxCol = 0;
    int maxRow = 0;

    for (int i = 0; i < table.length; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < table[i].length; j++) {
        table[i][j] = Integer.parseInt(st.nextToken());
        if (max <= table[i][j]) {
          max = table[i][j];
          maxCol = i+1;
          maxRow = j+1;
        }
      }
    }
    System.out.println(max);
    System.out.println(maxCol + " " + maxRow);
  }
}

