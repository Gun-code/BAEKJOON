package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int t = m;
        int n, k;
        int j = Integer.MIN_VALUE;
        int a = 0;

        while (true) {
            t = t / 10;
            a++;
            if (t == 0) {
                break;
            }
        }
        int start = m - 9 * a;
        if (start < 5) {
            start = 1;
        }
        
        for (; start < m; start++) {
            a = 0;
            t = start;
            n = start;
            while (true) {
                t = t / 10;
                a++;
                if (t == 0) {
                    break;
                }
            }
            for (int i = a; 0 < i; i--) {
                k = (int) ((start % Math.pow(10, i))-(start % Math.pow(10, i-1)));
                if (k > 9) {
                    k = (int) (k / Math.pow(10, i - 1));
                }
                n = n + k;
            }
            if (n == m) {
                j = start;
                System.out.println(start);
                break;
            }
        }
        if (j < 0) {
            System.out.println("0");
        }

    }
}
