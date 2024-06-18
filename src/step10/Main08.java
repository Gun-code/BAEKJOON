package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a[] = new int[3];
        int max = Integer.MIN_VALUE;
        int n = 0;
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            if (max < a[i]) {
                max = a[i];
                n = i;
            }
        }
        if (n == 0) {
            if (a[0] - a[1] - a[2] >= 0)
                System.out.println(2 * (a[1] + a[2]) - 1);
            else
                System.out.println(a[0]+a[1]+a[2]);
        }else if (n == 1) {
            if (a[1] - a[0] - a[2] >= 0)
                System.out.println(2 * (a[0] + a[2]) - 1);
            else
                System.out.println(a[0]+a[1]+a[2]);
        }else if (n == 2) {
            if (a[2] - a[1] - a[0] >= 0)
                System.out.println(2 * (a[1] + a[0]) - 1);
            else
                System.out.println(a[0]+a[1]+a[2]);
        }
    }
}
