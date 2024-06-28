package advanced_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int starCount = 1;

    for (int i = 1; i <= 2 * num - 1; i++) {
      if (i <= num) {
        for (int j = 0; j < num - i; j++) {
          System.out.print(" ");
        }
      } else {
        for (int j = 0; j < i - num; j++) {
          System.out.print(" ");
        }
      }
        for (int k = 0; k < starCount; k++) {
          System.out.print("*");
        }
        System.out.println();
        if (i >= num) {
          starCount -= 2;
        } else {
          starCount += 2;
        }
      }
    }
  }
