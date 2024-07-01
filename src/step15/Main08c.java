package step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main08c {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num];
        

        boolean prime[] = new boolean[1000001];
        prime[2] = true;
        for (int primeN = 3; primeN < 1000000;) {
            int j = 1;
            do {
                j += 2;
                if (primeN == j)
                    prime[primeN] = true;
                else if (primeN % j == 0)
                    break;
                else if (j * j > primeN)
                    prime[primeN] = true;

            } while (j * j < primeN);
            primeN += 2;
        }
        for (int i = 0; i < num; i++) {
            arr[i] = primeCount(prime, Integer.parseInt(br.readLine()));
        }
        for (int i = 0; i < num; i++) {
            bw.write(arr[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
        
    }

    public static int primeCount(boolean[] arr, int a) {
        int count = 0;

        if (a <= 2)
            return 0;
        else if (a == 4 || a==5)
            return 1;
        else {
            for (int i = 0; i <= a / 2; i++) {
               if(arr[i] && arr[a-i])
                   count++;
            }
        }

        return count;
    }
}
