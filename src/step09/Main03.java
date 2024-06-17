package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            
            int j = Integer.parseInt(st.nextToken());

            for (int c = 2; c < j+1;c++){
                if (j % c == 0 && c != j) {
                    break;
                } else if (j % c == 0 && c == j) {
                    k += 1;
                }

            }
            
        }
        System.out.println(k);
    }
}
