package M25192; // 25192번 문제 인사성 밝은 곰곰이

/*
 * 단톡방 입장 시 곰곰이 임티로 기존 회원들이 환영해줌.
 * 단톡방 입장 시 'ENTER'으로 표시하며 모든 테스트의 시작은 count 수 이후 'ENTER'으로 시작.
 * 채팅 내용은 표시되지 않으며 기존 회원 ID만 표시, 일반 채팅을 하기위해선 곰곰이임티로 환영을 한 후 해야함.
 * 곰곰이 임티를 쓴 회원은 몇명인지 구하시오.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        System.setIn(new FileInputStream("C:/A/BAEKJOON/src/M25192/data/test.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine()); // 총 채팅 수
        Chat chat = new Chat(); 
        for(int i = 0; i < count; ++i) {
            String line = br.readLine();
            if(line.equals("ENTER"))
                chat.init();
            else if(!(chat.isDuplicate(line)))
                chat.addCount(line);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(chat.totalNum()));
        
        bw.flush();
        bw.close();
        br.close();
    }
}

class Chat {
    private HashMap<String, Integer> list;
    private int count = 0;

    public void init() {
        list = new HashMap<>();
    }

    public boolean isDuplicate(String line) {
        return list.containsKey(line);
    }

    public void addCount(String line) {
        ++count;
        list.put(line, 1);
    }

    public int totalNum() {
        return count;
    }

}