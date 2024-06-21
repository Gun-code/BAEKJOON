package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int num = 666;
        boolean k;
        int i = 0;

        while (true) {
            k = prove(num);

            if (k)
                i++;

            if (i == n)
                break;

            num++;
        }
        System.out.println(num);

    }

    public static boolean prove(int a) {
        String n = String.valueOf(a);
        if (n.contains("666"))
            return true;
        else
            return false;
    }
}
