package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        sb.append(br.readLine());
        System.out.println(sb.substring(0, 1));
        for (int i = 0; i < sb.length()+1; i++) {
            for (int j = i+1; j < sb.length()+1; j++) {
                if (map.get(sb.substring(i, j)) == null) {
                    map.put(sb.substring(i, j), 1);
                }
            }
        }
        System.out.println(map.size());
    }
}
