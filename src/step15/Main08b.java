package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main08b {
    static ArrayList<Integer> prime = new ArrayList<>();

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> result = new ArrayList<>();
        prime.add(2);

        int arr[] = new int[num];

        for (int primeN = 3; primeN < 1000000;) {
            int j = 1;
            do {
                j += 2;
                if (primeN == j)
                    prime.add(primeN);
                else if (primeN % j == 0)
                    break;
                else if (j * j > primeN)
                    prime.add(primeN);

            } while (j * j < primeN);
            primeN += 2;
        }

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            result.add(goldBach(arr[i]));
        }

        for (int i = 0; i < num; i++) {
            System.out.println(result.get(i));
        }
    }

    public static int goldBach(int a) {
        int count = 0;
        int left = 0;
        int right = prime.size() - 1;
        int num = prime.size() - 1;

        if (prime.get(0) == a || prime.get(1) == a) {
            num = 0;
        } else if (prime.get(num) > a) {
            while (left <= right) {
                int mid = (left + right) / 2;
                if (prime.get(mid) < a) {
                    left = mid + 1;
                    if (prime.get(mid + 1) >= a) {
                        num = mid;
                        break;
                    }
                } else if (prime.get(mid) > a) {
                    right = mid - 1;
                }
            }
        }
        int i = -1;
        if (a == 2) {
            return 0;
        }else if (a == 4) {
            return 1;
        }else{
        do {
            i++;
             for (int j = num; prime.get(j) >= a / 2 - 1; j--) {
                 int result = prime.get(i) + prime.get(j);
                 if (result == a) {
                     count++;
                 } else if (result < a)
                     break;
             }
        } while (prime.get(i + 1) < a / 2 + 1);
        return count;
        }
    }
}
