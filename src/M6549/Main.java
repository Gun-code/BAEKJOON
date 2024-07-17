package M6549;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Rectangle rec = new Rectangle();
            rec.load(br.readLine());
            sb.append(rec.calcArea());
        }
    }
}

class Rectangle {
    private String[] stringRec;
    private int[] intRec;
    private int area;
    private int wide;
    

    public void load(String line) {
        stringRec = line.split("");
        HashMap<Integer, Integer> area = new HashMap<>();
        int max = 0;
        wide = 1;

        for (int i = 0; i < stringRec.length; ++i) {
            intRec[i] = Integer.parseInt(stringRec[i]);
            if(intRec[i] > max){
                max = intRec[i];
                if (i > 0) {
                    if()
            }}

        }
    }


    public String calcArea() {
        int wide = 1;

    }

}