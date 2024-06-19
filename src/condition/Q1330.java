package condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("10000과 -10000 사이의 숫자 중 2개 입력하세요 ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if ((a <= 10000 && a >= -10000) && (b <= 10000 && b >= -10000)) {
                if (a > b) {
                    System.out.println(">");
                } else if (a < b) {
                    System.out.println("<");
                } else if (a == b) {
                    System.out.println("==");
                }
                break;
            } else {
                System.out.println("10000과 -10000 사이의 숫자에서 입력하세요");
            }
        }
    }
}