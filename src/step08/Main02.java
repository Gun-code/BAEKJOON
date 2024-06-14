package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean rep = true;

        int a = 0;
        int sum = n;

        while (rep) {
            while (true) {
                int h = (int) (sum - Math.pow(b, a));
                if (h <= 0) {
                    break;
                }
                a++;
            }
            for (; a >= 0; a--) {
                sum = (int) (sum - Math.pow(b, a - 1));
                if(){
                    

                }
            }
        }
    }
}
