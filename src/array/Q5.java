package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5 {
    //10810
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n];

        for (int a = 0; a < m; a++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st1.nextToken());
            int j = Integer.parseInt(st1.nextToken());
            int k = Integer.parseInt(st1.nextToken());

            for (; i <= j; i++) {
                if (basket[i-1] == 0) {
                    basket[i-1] = k;
                } else {
                    basket[i-1] = k;
                }
            }
        }

        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}