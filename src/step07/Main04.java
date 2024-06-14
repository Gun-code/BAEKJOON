package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int wid = 0;
        int high = 0;
        int sum = 0;


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            wid = Integer.parseInt(st.nextToken());
            high = Integer.parseInt(st.nextToken());
            sum += 100;
            if()
        }

    }
}
