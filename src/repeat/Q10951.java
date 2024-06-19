package repeat;

import java.io.*;

public class Q10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lineNumber;
        int sum;

        while (true) {
            lineNumber = br.readLine().split(" ");
            sum = Integer.parseInt(lineNumber[0]) + Integer.parseInt(lineNumber[1]);
            bw.write(sum + "\n");
            bw.flush();
            }
        }
    }
