package M27433;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        System.setIn(new FileInputStream("C:/A/BAEKJOON/src/M27433/data/test.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long result = factorial(Long.parseLong(br.readLine()));

        System.out.println(result);
    }

    static long factorial(long num) {
        if (num == 0)
            return 1L;
        return num * factorial(num - 1);
    }
}