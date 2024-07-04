package advanced_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    for (int i = 0; i < input.length(); i++) {

      if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
        System.out.print(0);
        return;
      } else if (i == input.length() - 1) {
        System.out.print(1);
        break;
      }
    }
  }
}