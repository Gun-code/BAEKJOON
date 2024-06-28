package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long change;
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long result = 1;

        if (a < b) {
            change = a;
            a = b;
            b = change;
        }
        long num1 = a;
        long num2 = b;
        while (true) {
            result = num1 % num2;
            if (result == 0)
                break;
            num1 = num2;
            num2 = result;
        }
        
        System.out.printf("%d",(a*b)/num2);
    }
}
