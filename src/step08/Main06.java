package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long i = 0;
        long j = 0;

        int x = -1;
        int y = 1;
        
        if (n == 1) {
            System.out.println("1/1");
        } else {
           
            for (long c = 0; c < n-1; c++) {
                i += x;
                j += y;
                if (i < 0) {
                    i = 0;
                    x = x * -1;
                    y = y * -1;
                    continue;
                } else if (j < 0) {
                    j = 0;
                    x = x * -1;
                    y = y * -1;
                }
            }
            System.out.printf("%d/%d", i+1,j+1);
        }

    }
}
