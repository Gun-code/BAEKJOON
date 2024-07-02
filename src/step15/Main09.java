package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main09 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;

        for (int i = 2; i * i < num + 1; i++) {
            count++;
        }
        System.out.println(count);
    }
}
