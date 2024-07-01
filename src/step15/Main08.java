package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main08 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int servNum[] = new int[num];
        int arr[] = new int[num];
        int max = Integer.MIN_VALUE;

        ArrayList<Integer> prime = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            servNum[i] = Integer.parseInt(br.readLine());
            if (max < servNum[i])
                max = servNum[i];
        }

        prime = primeNum(max);

        for (int i = 0; i < num; i++) {
            arr[i] = goldBach(prime, servNum[i]);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }

    public static ArrayList<Integer> primeNum(int a) {
        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(2);
        for (int primeN = 3; primeN < a;) {
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
        return prime;
    }

    public static int goldBach(ArrayList<Integer> prime, int a) {
        int count = 0;
        int num = prime.size()-1;
        int mid = num / 2;
        int move = prime.size();

        if (prime.get(num - 1) > a) {
            while (true) {
                move = move / 2;
                if (prime.get(mid) > a) {
                    mid = mid - move;
                } else if (prime.get(mid) < a) {
                    if (prime.get(mid + 1) > a) {
                        num = mid;
                        break;
                    } else
                        mid = mid + move;
                }
            }
        }

        for (int i = -1; i < num;) {
            i++;
            for (int j = num; j >= i; j--) {
                int result = prime.get(i) + prime.get(j);
                if (result == a) {
                    count++;
                } else if (result < a)
                    break;

            }
        }
        return count;
    }
}
