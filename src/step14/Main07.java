package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int aNum = Integer.parseInt(st.nextToken());
        int bNum = Integer.parseInt(st.nextToken());

        int arr[] = new int[aNum];
        int brr[] = new int[bNum];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aNum; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bNum; i++) {
            brr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(brr);

        int i = 0;
        int j = 0;
        int count = 0;
        while (!(arr.length == i || brr.length == j)) {
            if (arr[i] == brr[j]) {
                count += 1;
                i++;
            } else if (arr[i] > brr[j])
                j++;
            else
                i++;

        }
        System.out.println(arr.length + brr.length - count*2);
    }
}
