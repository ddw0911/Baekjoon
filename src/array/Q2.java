package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
    //10807
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] num = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(st1.nextToken());
        }

        int count = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < x) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
