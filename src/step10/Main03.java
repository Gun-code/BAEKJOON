package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a[] = new int[3];
        int b[] = new int[3];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        if ((a[0] - a[1] == 0)) {
            a[0] = 0;
            a[1] = 0;
        } else if (a[0] - a[1] != 0) {
            if (a[0] - a[2] == 0) {
                a[0] = 0;
                a[2] = 0;
            } else {
                a[1] = 0;
                a[2] = 0;
            }
        }
        if (b[0] - b[1] == 0) {
            b[0] = 0;
            b[1] = 0;
        } else if (b[0] - b[1] != 0) {
            if (b[0] - b[2] == 0) {
                b[0] = 0;
                b[2] = 0;
            } else {
                b[1] = 0;
                b[2] = 0;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (a[i] > 0) {
                System.out.printf("%d ", a[i]);
            }
        }
        for (int i = 0; i < 3; i++) {
            if (b[i] > 0) {
                System.out.printf("%d", b[i]);
            }
        }
    }
}
