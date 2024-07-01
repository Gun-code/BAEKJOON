package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();

        if (min < 3) {
            arr.add(2);
            min = 3;
        }
        if (min % 2 == 0)
            min++;

        for (int i = min; i < max + 1;) {
            int j = 1;
            do {
                j += 2;
                if (i == j)
                    arr.add(j);
                else if (i % j == 0)
                    break;
                else if ((j) * (j) > i)
                    arr.add(i);
            } while (j * j < i);
            i += 2;
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
