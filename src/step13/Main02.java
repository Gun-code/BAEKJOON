package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int[5];
        int sum=0;
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(br.readLine());
            sum = sum + a[i];
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int k;
                if (a[i] > a[j]) {
                    k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                }
            }
        }
        System.out.println(sum / 5);
        System.out.println(a[2]);
    }
}
