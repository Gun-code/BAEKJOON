package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main10 {

    public static void main(String[] args) throws IOException {

        Balloon balloon = new Balloon();
        balloon.cache();
        balloon.pop();
    }
}


class Balloon {

    private int[] balloon;
    private StringBuilder result;
    private int count;

    public Balloon() {
        result = new StringBuilder();

    }

    public void pop() throws IOException {
        
        int index = 0;
        for (int i = 0; i < balloon.length; ++i) {

            int move = balloon[index];
            result.append(index + 1);
            balloon[index] = 0;

            if (i == balloon.length - 1)
                break;

            result.append(" ");
            if (move > 0) { // 오른쪽 이동(양수)
                for (int j = 0; j < move; ++j) {
                    ++index;
                    if(index >= balloon.length)
                        index = 0;
                    while (balloon[index] == 0) {
                        ++index;
                        if(index >= balloon.length)
                            index = 0;
                    }
                        
                }
            } else { // 왼쪽 이동(음수)
                for (int j = 0; j > move; --j) {
                    if (index == 0)
                        index = balloon.length;
                    --index;
                    while (balloon[index] == 0) {
                        if (index == 0)
                            index = balloon.length;
                        --index;
                    }
                }
                           
            }
        }
            
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result.toString());
        bw.flush();
        bw.close();
    }

    public void cache() throws IOException {

        System.setIn(new FileInputStream("C:/A/BAEKJOON/src/step16/data/4.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        count = Integer.parseInt(st.nextToken());
        balloon = new int[count];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; ++i) 
            balloon[i] = Integer.parseInt(st.nextToken());
        br.close();
    }
    
}
