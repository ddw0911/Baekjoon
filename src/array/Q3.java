package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3 {
    //10818
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        int[] num = new int[a];
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(st1.nextToken());
        }

        int max = num[0];
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            max = Math.max(max, num[i]);
            min = Math.min(min, num[i]);
            }
        System.out.printf("%s %s", min, max);
        }
    }

