package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    String result ="";

    for (int i = 0; i < testCase; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int count = Integer.parseInt(st.nextToken());
      String input = st.nextToken();
      for (int j = 0; j < input.length(); j++) {
        for (int k = 0; k < count; k++) {
          result += Character.toString(input.charAt(j));
        }
        if (j == input.length()-1) {
          result += "\n";
          break;
        }
      }
    }
    System.out.print(result);
  }
}
