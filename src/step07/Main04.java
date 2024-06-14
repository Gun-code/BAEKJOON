package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean arr[][] = new boolean[100][100];
        int sum = 0;
        int wid,high;

        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            wid = Integer.parseInt(st.nextToken());
            high = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    arr[wid + j][high + k] = true;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j]) {
                    sum += 1;
                }
            }
        }
        System.out.println(sum);
    }
}
