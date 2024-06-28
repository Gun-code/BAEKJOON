package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long numerator1 = Long.parseLong(st.nextToken());
        long denominator1 = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long numerator2 = Long.parseLong(st.nextToken());
        long denominator2 = Long.parseLong(st.nextToken());
        long change;
        long gcd;
        if (denominator1 < denominator2) {
            change = denominator1;
            denominator1 = denominator2;
            denominator2 = change;

            change = numerator1;
            numerator1 = numerator2;
            numerator2 = change;

        }
        long a = denominator1;
        long b = denominator2;
        long result = 1;
        while (true) {
            result = a % b;
            if (result == 0)
                break;
            a = b;
            b = result;
        }
        long lnc = (denominator1 * denominator2) / b;
        a = lnc / denominator1;
        b = lnc / denominator2;

        long result1 = numerator1 * a + numerator2 * b;

        a = result1;
        b = lnc;
        while (true) {
            result = a % b;
            if (result == 0)
                break;
            a = b;
            b = result;
        }
        gcd = b;

        System.out.printf("%d %d", result1 / gcd, lnc / gcd);

    }
}
