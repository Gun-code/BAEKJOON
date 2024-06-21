package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int less;
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    less = a[i];
                    a[i] = a[j];
                    a[j] = less;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
