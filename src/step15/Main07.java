package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main07 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        ArrayList<Integer> arr = new ArrayList<>();
        while ((num = Integer.parseInt(br.readLine())) != 0) {
            int min = num + 1;
            int max = num * 2;
            ArrayList<Integer> count = new ArrayList<>();

            if (min < 3) {
                count.add(2);
                min = 3;
            }
            if (min % 2 == 0)
                min++;

            for (; min < max;) {
                int i = 1;
                do {
                    i += 2;
                    if (i == min)
                        count.add(i);
                    else if (min % i == 0) {
                        break;
                    } else if (i * i > min)
                        count.add(i);
                        
                } while (i * i < min);
                min += 2;
            }

            arr.add(count.size());
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
}
