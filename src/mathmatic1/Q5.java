package mathmatic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int input = Integer.parseInt(br.readLine());
    int i = 1;
    while (input > 0) {
      if (input == 1) {
        break;
      }
      input -= 6 * i;
      i++;
    }
    System.out.println(i);
    }
  }