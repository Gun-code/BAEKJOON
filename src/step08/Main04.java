package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dot = 2;

        for (int i = 0; i < n; i++) {
            dot = 2 * dot - 1;

        }
        System.out.println(dot * dot);

    }
}
