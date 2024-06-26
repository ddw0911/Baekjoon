package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    String input1 = st.nextToken();
    String input2 = st.nextToken();



    input1 = input1;
    input2 = input2.substring(2, 0);
    System.out.println(input1);
    System.out.println(input2);
  }
}
