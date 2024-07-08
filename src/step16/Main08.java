package step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main08 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int peopleNum = Integer.parseInt(st.nextToken());
        int interval = Integer.parseInt(st.nextToken());

        ArrayList<Integer> seq  = new ArrayList<>(peopleNum);
        for (int i = 0; i < peopleNum; i++) 
            seq.add(i + 1);
                
        int resultIndex = 0;
        int seqIndex = 0;
        int intervalIndex = 0;
        int[] result = new int[peopleNum];
        while (seq.size() > 1) {
            if (seqIndex == seq.size())
                seqIndex = 0;
            else {    
                if (intervalIndex == interval - 1) {
                    intervalIndex = 0;
                    result[resultIndex] = seq.get(seqIndex);
                    seq.remove(seqIndex);
                    ++resultIndex;
                } else {
                    ++seqIndex;
                    ++intervalIndex;
                }
            }
        }
        result[resultIndex] = seq.get(0);

        System.out.printf("<");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d", result[i]);
            if (i < result.length - 1)
                System.out.printf(", ");
        }
        System.out.printf(">");
    }
}
