package repeat;

import java.io.*;

public class Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lines = Integer.parseInt(br.readLine());
        String[] lineNumber;
        int sum;

        for (int i = 0; i < lines; i++) {
            lineNumber = br.readLine().split(" ");
            sum = Integer.parseInt(lineNumber[0]) + Integer.parseInt(lineNumber[1]);
            bw.write(sum + "\n");
        }
        bw.close();
    }
}
