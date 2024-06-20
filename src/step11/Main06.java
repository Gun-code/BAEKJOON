package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = 0;
        int min = 2001;

        for (int i = 0; i < n / 3 + 1; i++) {
            for (int j = 0; j < n / 5 + 1; j++) {
                k = 3 * i + 5 * j;
                if (k > n)
                    break;
                if (k == n && i + j < min) {
                    min = i + j;
                }
            }

        }
        if (min == 2001)
            System.out.print("-1");
        else
            System.out.print(min);
    }
}
