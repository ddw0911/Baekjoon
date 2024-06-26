package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1274 {
    // 커피숍1
    // https://www.acmicpc.net/problem/1274
    // 현재 마시는 커피보다 진한 커피를 같은 날 마셨었다면 현재 마시는 커피의 맛을 느끼지 못한다.
    // -> 이전 커피보다 현재 커피의 농도(dense)가 더 낮아야 한다

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine(); // 첫째줄 농도 value 입력
        String[] dense = str1.split(" "); // 입력받은 value를 공백으로 구분지어 String 배열에 할당
        // System.out.println(Arrays.toString(dense));

        String str2 = br.readLine(); // 둘째줄 항아리 크기 두가지, 컵의 크기 value 입력
        String[] cap = str2.split(" ");
        // System.out.println(Arrays.toString(cap));



    }
}
