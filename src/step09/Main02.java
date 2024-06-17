package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n;
        
        while (true) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            ArrayList<Integer> al = new ArrayList<Integer>();
            int k=0;

            if(n == -1){
                break;
            }
            for (int i = 1; i < (n / 2) + 1; i++) {
                if (n % i == 0) {
                    al.add(i);
                    k = k + i;
                }
            }
            if (n == k) {
                System.out.printf("%d = ", n);
                for (int i = 0; i < al.size(); i++) {
                    System.out.printf("%d", (al.get(i)));
                    if (i < al.size() - 1) {
                        System.out.printf(" + ");
                    } else {
                        System.out.println();
                    }
                }
            } else {
                System.out.printf("%d is NOT perfect.\n",n);
            }
            

            
        }
        
    }
}
