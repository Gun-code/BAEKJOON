package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main03 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str[] = new String[5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            str[i] = st.nextToken();
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(str[j].length()>i){
                    System.out.printf("%c", str[j].charAt(i));
                } else if (str[j].length() <= i) {
                    continue;
            }
        }
        }
    }
}
