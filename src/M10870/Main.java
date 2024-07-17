package M10870;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        System.setIn(new FileInputStream("C:/A/BAEKJOON/src/M10870/data/test.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int result = pibonacci(num);
        System.out.println(result);
    }

    private static int pibonacci(int num) {
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else 
            return pibonacci(num - 1) + pibonacci(num - 2);
        
    }
}
