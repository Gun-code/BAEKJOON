package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main05 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int a[] = new int[n];
        int b[] = new int[n];
        int amax = Integer.MIN_VALUE;
        int amin = Integer.MAX_VALUE;
        int bmax = Integer.MIN_VALUE;
        int bmin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            if (amax < a[i])
                amax = a[i];
            if (amin > a[i])
                amin = a[i];
            b[i] = Integer.parseInt(st.nextToken());
            if (bmax < b[i])
                bmax = b[i];
            if (bmin > b[i])
                bmin = b[i];
        }
        System.out.println((amax-amin)*(bmax-bmin));
    }
}
