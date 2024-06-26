package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q9 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb1 = new StringBuilder();
    sb1.append(st.nextToken());
    sb1.reverse();
    int num1 = Integer.parseInt(String.valueOf(sb1));

    StringBuilder sb2 = new StringBuilder();
    sb2.append(st.nextToken());
    sb2.reverse();
    int num2 = Integer.parseInt(String.valueOf(sb2));

    System.out.println(Math.max(num1, num2));
  }
}
