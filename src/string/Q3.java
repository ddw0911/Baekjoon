package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q3 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCount = Integer.parseInt(br.readLine());
    String[] testCase = new String[testCount];
    for (int i = 0; i < testCount; i++) {
      testCase[i] = br.readLine();
      testCase[i] = Character.toString(testCase[i].charAt(0)) + Character.toString(testCase[i].charAt(testCase[i].length()-1));
    }

    for (int i = 0; i < testCase.length; i++) {
      System.out.println(testCase[i]);
    }
  }
}
