package step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        ArrayList<Integer> stack = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(st.nextToken())) {
                case 1: {
                    stack.add(Integer.parseInt(st.nextToken()));
                    index++;
                }
                    continue;
                case 2: {
                    if (index > 0) {
                        result.add(stack.get(index - 1));
                        stack.remove(index - 1);
                        index--;
                    } else
                        result.add(-1);
                }
                    continue;
                case 3: {
                    result.add(stack.size());
                }
                    continue;
                case 4: {
                    if (stack.size() > 0)
                        result.add(0);
                    else
                        result.add(1);
                }
                    continue;
                case 5: {
                    if (stack.size() > 0)
                        result.add(stack.get(0));
                    else
                        result.add(-1);
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
