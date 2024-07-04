package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(st.nextToken());
        int stack[] = new int[num];
        StringBuilder sb = new StringBuilder();

        int index = 0;
        

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(st.nextToken())) {
                case 1: {
                    stack[index] = Integer.parseInt(st.nextToken());
                    index++;
                }
                    continue;
                case 2: {
                    if (index > 0) {
                        sb.append(String.valueOf(stack[index - 1]) + "\n");
                        stack[index - 1] = 0;
                        index--;
                    } else
                        sb.append("-1\n");
                }
                    continue;
                case 3: {
                    sb.append(String.valueOf(index) + "\n");
                }
                    continue;
                case 4: {
                    if (index > 0)
                        sb.append("0\n");
                    else
                        sb.append("1\n");
                }
                    continue;
                case 5: {
                    if (index > 0)
                        sb.append(String.valueOf(stack[index - 1]) + "\n");
                    else
                        sb.append("-1\n");
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();

        br.close();
        bw.close();
    }
}
