package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int a;
        int b;
        int g;
        int result[] = new int[num];
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            g = gcd(a, b);
            
            result[i] = (a * b) / g;
        }
        for (int i = 0; i < num; i++) {
            System.out.println(result[i]);
        }
    }

    public static int gcd(int a, int b) {
        int result = 1;
        int change;
        if (a < b) {
            change = a;
            a = b;
            b = change;
        }

        while (true) {
            result = a % b;
            if (result == 0) {
                break;
            }
            a = b;
            b = result;
        }
        
        return b;

    }
}
