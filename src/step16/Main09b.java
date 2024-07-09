package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main09b {
    
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("C:/A/BAEKJOON/src/step16/data/4.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int[] deck = new int[2_000_000];
        ArrayList<Integer> result = new ArrayList<>();
        int frontIndex = 1000000, backIndex = 1000000;
        for (int i = 0; i < count; i++) {

            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            int size = backIndex - frontIndex; // 정수 개수
            switch (order) {
                case 1: //X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
                    deck[--frontIndex] = Integer.parseInt(st.nextToken());
                    break;

                case 2: //X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
                    deck[backIndex++] = Integer.parseInt(st.nextToken());
                    break;

                case 3: //덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                    if(size > 0) {
                        result.add(deck[frontIndex++]);
                    } else
                        result.add(-1);
                    break;

                case 4: //덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                    if (size > 0) {
                        result.add(deck[--backIndex]);
                    }else
                        result.add(-1);
                    break;
                    
                case 5: //덱에 들어있는 정수의 개수를 출력한다.
                    result.add(size);
                    break;

                case 6: //덱이 비어있으면 1, 아니면 0을 출력한다.
                    if (size == 0)
                        result.add(1);
                    else
                        result.add(0);
                    break;

                case 7: //덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                    if (size  0)  // size가 0일 경우 frontIndex와 backIndex가 같은 배열을 가르킨다.
                        result.add(deck[frontIndex]);
                    else
                        result.add(-1);
                    break;

                case 8: // 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                    if (size > 0) 
                        result.add(deck[backIndex-1]);
                    else
                        result.add(-1);
                    break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < result.size(); i++)
            bw.write(result.get(i)+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}

