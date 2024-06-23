package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int anum = Integer.parseInt(st.nextToken());
        int bnum = Integer.parseInt(st.nextToken());

        int result = 0;

        Map<String, Integer> map = new HashMap<>(anum);
        
        for (int i = 0; i < anum; i++) {
            map.put(br.readLine(), 1);
        }
        for (int i = 0; i < bnum; i++) {
            Integer count = map.get(br.readLine());

            if (count !=null && count == 1)
                result += 1;
            else
                continue;
        }

        System.out.println(result);

    }
}
