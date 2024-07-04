package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q7 {

  //3052
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] submit = new int[28];
    for (int i = 0; i < submit.length; i++) {
      submit[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(submit);

    int[] student = new int[30];
    for (int i = 0; i < student.length; i++) {
      student[i] = i + 1;
      if (submit[i] != student[i]) {
        System.out.println(student[i]);

      }
    }
  }
}
