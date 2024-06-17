package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (true) {
            if (n == 1) {
                break;
            }
            for (int i = 2; i < n+1; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    n = n / i;
                    break;
                }
            }
        }
    }
}
