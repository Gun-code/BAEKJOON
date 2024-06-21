package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < num.length(); i++) {
            al.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }
        Collections.sort(al);

        Collections.reverse(al);

        for (int i = 0; i < num.length(); i++) {
            System.out.printf("%d",al.get(i));
        }
    }
}
