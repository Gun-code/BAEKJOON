package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int arr[] = new int[num];
        int brr[] = new int[num];
        for (int i = 0; i < num; i++) {
            ArrayList<Integer> arrAl = new ArrayList<>();
            ArrayList<Integer> brrAl = new ArrayList<>();
            ArrayList<Integer> cross = new ArrayList<>();
            ArrayList<Integer> sum = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            brr[i] = Integer.parseInt(st.nextToken());
            int multi = 1;

            for (int j = 2; j < arr[i];) {
                if (arr[i] % j == 0) {
                    arrAl.add(j);
                    arr[i] = arr[i] / j;
                } else
                    j++;
            }
            if (arr[i] > 1) {
                arrAl.add(arr[i]);
            }
            for (int j = 0; j < arrAl.size(); j++) {
                System.out.printf("%d ", arrAl.get(j));
            }
            System.out.println();
            System.out.println("-------------------------");
            for (int j = 2; j < brr[i];) {
                if (brr[i] % j == 0) {
                    brrAl.add(j);
                    brr[i] = brr[i] / j;
                } else
                    j++;
            }
            if (brr[i] > 1) {
                brrAl.add(brr[i]);
            }
            for (int j = 0; j < brrAl.size(); j++) {
                System.out.printf("%d ", brrAl.get(j));
            }
            System.out.println();
            cross.addAll(arrAl);
            cross.retainAll(brrAl);

            sum.addAll(arrAl);
            sum.removeAll(cross);
            sum.addAll(brrAl);

            for (int j = 0; j < sum.size(); j++) {
                multi = multi * sum.get(j);
            }
            System.out.println(multi);
        }

    }
}
