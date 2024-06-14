package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main07 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //실행 횟수
        int m = n; //결과값
        
        for (int i = 0; i < n; i++) {               //스캔 반복문
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();    //스캔한 문자열 str
            boolean[] az = new boolean[26]; // 알파벳 a-z
            int num = 0; // 그룹문자가 아닌 수
                        
            if (str.length() == 1) {
                continue;
            }
            
            for (int j = 0; j < str.length() - 1; j++) { //문자열 비교 A B 중 A
                int k;
                for (k = 0; k < str.length() - 1;) { //비교 A B 중 B(k 번째 문자)
                    az[(int) str.charAt(j) - 97] = true;
                    int a1 = str.indexOf(str.charAt(j), k);
                    int a2 = str.indexOf(str.charAt(j), a1+1);
                    k = a1 + 1;
                    if (k == 0) {
                        break;
                    }
                    if (a1 > a2) {
                        break;
                    }else if(a1 < a2){
                        if (a1 + 1 != a2){
                            num += 1;
                            break;                            
                        }
                    }
                }
                if (num > 0) {
                    m -= 1;
                    break;
                }
            }
            }
        System.out.println(m);
        
    }
}