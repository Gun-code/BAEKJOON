package step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main06 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (1<num && num < 4) {
            System.out.println("2");
            return;
        } else if (num == 1) {
            System.out.println("1");
            return;
        } else {       
            ArrayList<Integer> baseArr = new ArrayList<>();
            if ( num % 2 != 0 ) {
                num = num / 2;
                
                for ( int i = 0; i < num -1 ; ++i ) {
                    baseArr.add(2 * (i + 2));
                }
                baseArr.add(2);
                
            } else {
                num = num / 2;
                for ( int i = 0; i < num ; ++i ) {
                    baseArr.add(2 * (i + 1));
                }
            }

            do {
                int temp = baseArr.get(1);
                baseArr.remove(0);
                baseArr.add(temp);
                baseArr.remove(0);
            } while (baseArr.size() > 1);
            
            System.out.println(baseArr.get(0));
            
        }
    }
}
