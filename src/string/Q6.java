package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    int count = 0;
    for (int j = 'a'; j <= 'z'; j++) {
      int i = 0;
      for (i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (j == ch) {
          System.out.print(i);
          System.out.print(" ");
          break;
        }
      }
      if (i == input.length()) {
        System.out.print("-1");
        if (j == 'z') {
          break;
        }
        System.out.print(" ");
      }
    }
  }
}
