package M11729;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Maint {
    
    static int count = 0;
 
	public static StringBuilder sb = new StringBuilder();
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        System.setIn(new FileInputStream("C:/A/BAEKJOON/src/M11729/data/test.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
 
		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
 
	}
 
	/*
		N : 원판의 개수 
		start : 출발지 
		mid : 옮기기 위해 이동해야 장소 
		to : 목적지
	 */
 
	public static void Hanoi(int N, int start, int mid, int to) {
        int num = 0;
        // 이동할 원반의 수가 1개라면?
        ++num;
        System.out.print("★ " + num + "번째 "+ "N : " + N + " source : " + start + " temp : " + mid +" destination : " + to);
        System.out.println(" from : " + start + " to : " + to );
		if (N == 1) {
            sb.append(start + " " + to + "\n");
            ++count;
            System.out.print(count + "번째> " + "N : " + N + " source : " + start + " temp : " + mid + " destination : " + to);
            System.out.println(" from : " + start + " to : " + to );
			return;
		}
 
		// A -> C로 옮긴다고 가정할 떄,
		// STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
		Hanoi(N - 1, start, to, mid);
    
		// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
        sb.append(start + " " + to + "\n");
        ++count;
        System.out.print(count + "번째> "+ "N : " + N + " source : " + start + " temp : " + mid +" destination : " + to);
        System.out.println(" from : " + start + " to : " + to );
    
		// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
		Hanoi(N - 1, mid, start, to);
 
	}
}