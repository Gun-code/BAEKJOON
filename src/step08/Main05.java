package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long h = 0;
        long i = 0;
        long j = 1;

        if (n == 1) {
            System.out.println(j);
            
        } else if (n > 1) {
            while (true) {
                ++i;
                h = 6 * i;
                j = j + h;
                if (n <= j) {
                    ++i;
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
