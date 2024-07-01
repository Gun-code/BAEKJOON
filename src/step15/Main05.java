package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main05 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        ArrayList<Long> arr = new ArrayList<>();
        ArrayList<Long> brr = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            arr.add(Long.parseLong(br.readLine()));
        }

        for (int i = 0; i < arr.size(); i++) {
            long a = arr.get(i);
            if (a <= 7) {

                if (a < 2) {
                    brr.add(2L);
                } else if (a == 4) {
                    brr.add(5L);
                } else if (6 <= a && a < 8) {
                    brr.add(7L);
                } else {
                    brr.add(a);
                }
            } else {
                if (a % 3 == 0)
                    a++;
                if (a % 2 == 0)
                    a++;

                while (true) {
                    boolean sw = false;
                    for (long j = 3; j * j < a;) {
                        if (a % j == 0)
                            break;
                        else if ((j + 2) * (j + 2) > a) {
                            sw = true;
                            brr.add(a);
                            break;
                        }
                        j += 2;
                    }

                    if (sw == true)
                        break;
                    a += 2;
                }
            }
        }
        for (int i = 0; i < brr.size(); i++) {
            System.out.println(brr.get(i));
        }

    }
}
