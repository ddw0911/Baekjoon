package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q8 {

  //3052
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] rest = new int[10];

    for (int i = 0; i < 10; i++) {
      int a = Integer.parseInt(br.readLine());
      rest[i] = a % 42;
    }
//    System.out.println(Arrays.toString(rest));

    int count = 0;
    int[] rest2 = Arrays.stream(rest)
        .distinct()
        .toArray();

//    System.out.println(Arrays.toString(rest2));
    System.out.println(rest2.length);
  }
}