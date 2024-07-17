package M26069;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {// 26069번 문제 붙임성 좋은 총총이
    public static void main(String[] args) throws NumberFormatException, IOException {

        System.setIn(new FileInputStream("C:/A/BAEKJOON/src/M26069/data/test.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ChongChong cc = new ChongChong();
        int count = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < count; ++i)
        cc.letsdance(br.readLine());
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(cc.howManyPeople()));
        bw.flush();
        bw.close();
        br.close();
    }
}

class ChongChong {
    private StringTokenizer st;
    private HashSet<String> userName = new HashSet<>();

    public ChongChong(){
        userName.add("ChongChong");
    }

    public int howManyPeople() {
        return userName.size();
    }

    public void letsdance(String line) {
        st = new StringTokenizer(line);
        String userA = st.nextToken();
        String userB = st.nextToken();
        
        if ("ChongChong".equals(userA) || userName.contains(userA)) 
            userName.add(userB);
        else if("ChongChong".equals(userB) || userName.contains(userB))
            userName.add(userA);
    }
    
}