package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int i = w - x;
        int j = h - y;

        if (i <= x) {
            if (j <= y) {
                if(i<=j)
                    System.out.println(i);
                else
                    System.out.println(j);
            } else {
                if(i<=y)
                    System.out.println(i);
                else
                    System.out.println(y);
            }
        } else{
            if (j <= y) {
                if(x<=j)
                    System.out.println(x);
                else
                    System.out.println(j);
            } else {
                if(x<=y)
                    System.out.println(x);
                else
                    System.out.println(y);
            }
        }
    }
}
