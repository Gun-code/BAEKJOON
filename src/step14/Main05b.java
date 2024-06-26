package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main05b {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[20000001];

        int anum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < anum; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[num+10000000] = arr[num+10000000] + 1;
        }

        st = new StringTokenizer(br.readLine());
        int bnum = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bnum; i++) {
            sb.append(arr[Integer.parseInt(st.nextToken())+10000000]).append(" ");
        }
        System.out.println(sb);

    }
}
