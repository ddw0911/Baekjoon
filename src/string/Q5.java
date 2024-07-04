package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());
    String sl = br.readLine();

    int sum = 0;
    for (int i = 0; i < num; i++) {
      sum += Integer.parseInt(String.valueOf(sl.charAt(i)));
    }
    System.out.print(sum);
  }
}
