package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main03 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int q = 0;//0.25
        int d = 0;//0.1
        int ni = 0;//0.05
        int p = 0; //0.01

        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());

            q = c / 25;
            c = c - 25 * q;
            System.out.printf("%d ",q);

            d = c / 10;
            c = c - 10 * d;
            System.out.printf("%d ",d);

            ni = c / 5;
            c = c - 5 * ni;
            System.out.printf("%d ",ni);

            p = c / 1;
            c = c - p;
            System.out.printf("%d\n",p);
            
        }

    }
}
