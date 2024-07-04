package mathmatic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = st.nextToken();

        int n = Integer.parseInt(st.nextToken());
        HashMap<Character, Integer> myUpper = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i < 10) {
                myUpper.put((char) ('0' + i), i);
            } else {
                myUpper.put((char)('A' + (i-10)), i);
            }
        }
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            sum += (int) (myUpper.get(input.charAt(i)) * Math.pow(n, input.length() - i - 1));
        }

        System.out.println(sum);
    }
}
