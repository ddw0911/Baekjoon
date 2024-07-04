package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < 100; i++) {
      if (br.readLine().equals("exit")) {
        break;
      }
      sb.append(br.readLine());
    }
    System.out.println(sb);
  }
}