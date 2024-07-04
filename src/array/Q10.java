package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10 {

  //1546
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int subject = Integer.parseInt(br.readLine());
    int[] real = new int[subject];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < real.length; i++) {
      real[i] = Integer.parseInt(st.nextToken());
    }
//    System.out.println(Arrays.toString(real));


    int max = real[0];
    for (int i = 1; i < real.length; i++) {
      max = Math.max(max, real[i]);
    }
//    System.out.println(max);

    double[] fake = new double[subject];

    for (int i = 0; i < real.length; i++) {
      fake[i] = (double) real[i] / (double) max * 100;
    }
//    System.out.println(Arrays.toString(fake));

    double sum = 0;
    for (int i = 0; i < fake.length; i++) {
      sum += fake[i];
    }
    System.out.println(sum / fake.length);
  }
}