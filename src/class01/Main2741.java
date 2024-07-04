package class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2741 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; ++i) {
            System.out.println(i+1);
        }
        
    }
}
