package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int saveNum = Integer.parseInt(st.nextToken());
        int compareNum = Integer.parseInt(st.nextToken());

        Map<Integer, String> poketkey = new HashMap<>(saveNum);
        Map<String, Integer> poketvalue = new HashMap<>(saveNum);

        for (int i = 0; i < saveNum; i++) {
            String name = br.readLine();
            poketkey.put(i, name);
            poketvalue.put(name, i);
        }

        for (int i = 0; i < compareNum; i++) {
            String compare = br.readLine();
            if (isNumeric(compare))
                System.out.println(poketkey.get(Integer.parseInt(compare)-1));
            else
                System.out.println(poketvalue.get(compare)+1);
        }
    }
    
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
