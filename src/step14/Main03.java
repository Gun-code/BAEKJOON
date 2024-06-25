package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        Map<String,String> start = new HashMap<>();

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String enter = st.nextToken();
            if (enter.equals("enter")) {
                start.put(name, enter);
            } else {
                start.remove(name);
            }
        }
        TreeMap<String, String> sortMap = new TreeMap<>(Comparator.reverseOrder());
        sortMap.putAll(start);
        LinkedHashMap<String, String> lm = new LinkedHashMap<>(sortMap);

        for (Map.Entry<String, String> entry : lm.entrySet()) {
            System.out.println(entry.getKey());
        }
        
        
    }
}
