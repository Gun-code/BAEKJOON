package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.StringTokenizer;

    public class Main11 {

        public static void main(String[] args) throws IOException {
            
            Queuestack deq = new Queuestack();
            deq.load();
            deq.insert();
            deq.print();
        }
    }

    class Queuestack {

        private ArrayDeque<Integer> deq;
        private int count;
        private boolean[] queuestack;
        private StringBuilder sb;
        private BufferedReader br;
        private StringTokenizer st;
        private int index;

        public void load() throws IOException {

            System.setIn(new FileInputStream("C:/A/BAEKJOON/src/step16/data/4.txt"));
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());

            count = Integer.parseInt(st.nextToken());
            deq = new ArrayDeque<>();
            queuestack = new boolean[count];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < count; ++i) {
                int token = Integer.parseInt(st.nextToken());
                if (token == 0)
                    queuestack[i] = true;
                else
                    queuestack[i] = false;
            }
            st = new StringTokenizer(br.readLine());
            index = 0;
            for (int i = 0; i < count; ++i)
                if (queuestack[i]) {
                    deq.addFirst(Integer.parseInt(st.nextToken()));
                    ++index;
                }else
                    st.nextToken();
        }
        
        public void insert() throws IOException {

            st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();
            int num = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < num; ++i) {
                int addNum = Integer.parseInt(st.nextToken());
                deq.add(addNum);
                addNum = deq.pollFirst();
                sb.append(addNum);
                if (i < num - 1) {
                    sb.append(" ");
                }
            }
        }

        public void print() throws IOException {

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(sb.toString());
            bw.flush();
            bw.close();
        }
    }
