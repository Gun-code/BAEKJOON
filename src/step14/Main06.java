package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int listenNum = Integer.parseInt(st.nextToken());
        int seeNum = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < listenNum; i++) {
            String name = br.readLine();
            map.put(name, name);
        }
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < seeNum; i++) {
            String name = br.readLine();
            if (map.get(name) != null) {
                al.add(name);
            }
        }
        Collections.sort(al);
        System.out.println(al.size());
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

    }
}
