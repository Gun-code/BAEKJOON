package M11729;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        System.setIn(new FileInputStream("C:/A/BAEKJOON/src/M11729/data/test.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Hanoi top = new Hanoi(count);
        top.move(count, 1, 2, 3);
        top.print();

    }
}

class Hanoi {
    StringBuilder sb;

    /* 하노이의 탑 A B C (From A to C) 3단계로 이루어져있음
    
     *    N   0   0
     * 0. A   B   C
     * 
     *    1  N-1  0
     * 1. A   B   C
     * 
     *    0  N-1  1
     * 2. A   B   C
     * 
     *    0   0   N
     * 3. A   B   C
     * 
     * 1단계 A(1) -> B(N-1) / C(0) Hanoi.move()에서 상위 move()재귀.
     * 2단계 A(0) -> C(1) / B(N-1) sb.append
     * 3단계 A(0)  / B(0) -> C(N) Hanoi.move()에서 하위 move()재귀.
     */
    public Hanoi(int count) {
        sb = new StringBuilder();
        sb.append((int)Math.pow(2, count) - 1 + "\n");
    }
    
    public void print() {
        System.out.println(sb);
    }

    public void move(int n, int start, int mid, int end){
        if (n == 1) {
            sb.append(start +" "+ end + "\n");
            return;
        }
        
        move(n - 1, start, end, mid); //위 주석 1단계

        sb.append(start + " " + end + "\n");//위 주석 2단계

        move(n - 1, mid, start, end);//위 주석 3단계
    }
}
