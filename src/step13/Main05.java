package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main05 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        ArrayList<Integer> a = new ArrayList<Integer>(count);

        for (int i = 0; i < count; i++) {
            a.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(a);

        for (int i = 0; i < count; i++) {
            System.out.println(a.get(i));
        }
        
    }
}
