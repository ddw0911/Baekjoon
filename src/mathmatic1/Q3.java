package mathmatic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int[][] changes = new int[testCase][4];
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for (int i = 0; i < testCase; i++) {
            int amount = Integer.parseInt(br.readLine());
            changes[i][0] = amount / quarter;
            changes[i][1] = (amount % quarter) / dime;
            changes[i][2] = (amount % quarter) % dime / nickel;
            changes[i][3] = ((amount % quarter) % dime) % nickel / penny;
        }

        for (int[] change : changes) {
            for (int i : change) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
