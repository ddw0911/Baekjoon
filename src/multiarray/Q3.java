package multiarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[][] board = new String[5][15];
    int maxLength = 0;

    for (int i = 0; i < board.length; i++) {
      String s = br.readLine();
      if (maxLength < s.length()) {
        maxLength = s.length();
      }

      for (int j = 0; j < board[i].length; j++) {
        if (j < s.length()) {
          board[i][j] = String.valueOf(s.charAt(j));
        } else {
          board[i][j] = "";
        }
      }
    }

    for (int i = 0; i < maxLength; i++) {
      for (int j = 0; j < board.length; j++) {
        if (!board[j][i].isEmpty()) {
          System.out.print(board[j][i]);
        }
      }
    }
  }
}

