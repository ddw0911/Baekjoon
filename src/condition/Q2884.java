package condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (b < 45) {
            if (a == 0) {
                System.out.println(23 + " " + (60 - (45 - b)));
            } else {
                System.out.println((a-1) + " " + (60-(45-b)));
            }
        } else if (b < 60){
            System.out.println(a + " " + (b - 45));
        }
    }
}