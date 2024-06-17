package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0;

        for (int i = m; i < n+1; i++) {
            for (int j = 2; j < i + 1; j++) {
                if (i % j == 0) {
                    if (j == i) {
                        al.add(i);
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < al.size(); i++) {
            sum = sum + (al.get(i));
        }
        if (al.size() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(al.get(0));
            System.out.println(al.get(al.size()-1));
        }
    }
}
