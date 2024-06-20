package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1 {
    //10807
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] num = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(st.nextToken());
        }
        int c = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            if (c == num[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
