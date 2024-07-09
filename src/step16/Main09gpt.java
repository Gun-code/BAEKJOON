package step16;

import java.io.*;
import java.util.*;

public class Main09gpt {//28279번 문제 덱 2  

    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("C:/A/BAEKJOON/src/step16/data/4.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int[] deck = new int[2_000_000];
        ArrayList<Integer> result = new ArrayList<>();
        int frontIndex = 1000000, backIndex = 1000000; // 둘다 같은 초기 위치로 설정
        for (int i = 0; i < count; i++) {

            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            int size = backIndex - frontIndex; // 정수 개수

            switch (order) {
                case 1: // X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
                    deck[--frontIndex] = Integer.parseInt(st.nextToken());
                    break;

                case 2: // X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
                    deck[backIndex++] = Integer.parseInt(st.nextToken());
                    break;

                case 3: // 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                    result.add(size > 0 ? deck[frontIndex++] : -1);
                    break;

                case 4: // 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                    result.add(size > 0 ? deck[--backIndex] : -1);
                    break;

                case 5: // 덱에 들어있는 정수의 개수를 출력한다.
                    result.add(size);
                    break;

                case 6: // 덱이 비어있으면 1, 아니면 0을 출력한다.
                    result.add(size == 0 ? 1 : 0);
                    break;

                case 7: // 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                    result.add(size > 0 ? deck[frontIndex] : -1);
                    break;

                case 8: // 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                    result.add(size > 0 ? deck[backIndex - 1] : -1);
                    break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int r : result) {
            bw.write(r + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}