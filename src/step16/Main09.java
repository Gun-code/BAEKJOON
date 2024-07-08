package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main09 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> deck = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int orderNum = Integer.parseInt(st.nextToken());
        for (int i = 0; i < orderNum; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            switch (order) {
                case 1:
                    frontInsert(deck, Integer.parseInt(st.nextToken()));
                    break;

                case 2:
                    backInsert(deck, Integer.parseInt(st.nextToken()));
                    break;

                case 3:
                    result.add(frontOutput(deck));
                    break;

                case 4:
                    result.add(backOutput(deck));
                    break;

                case 5:
                    result.add(deck.size());
                    break;
                    
                case 6:
                    if (deck.isEmpty())
                        result.add(1);
                    else
                        result.add(0);
                    break;

                case 7:
                    result.add(frontView(deck));
                    break;

                case 8:
                    result.add(backView(deck));
                    break;
            }
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < result.size(); i++) 
            bw.write(result.get(i) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
    
    static void frontInsert(ArrayList<Integer> deck, int front) {

        ArrayList<Integer> _deck = new ArrayList<Integer>();
        _deck.add(front);
        _deck.addAll(deck);
        deck.removeAll(deck);
        deck.addAll(_deck);
    }

    static void backInsert(ArrayList<Integer> deck, int back) {

        deck.add(back);
    }

    static int frontOutput(ArrayList<Integer> deck) {

        if (deck.size() > 0) {
            int frontOutput = deck.get(0);
            deck.remove(0);
            return frontOutput;
        } else
            return -1;
    }
    
    static int backOutput(ArrayList<Integer> deck) {

        if (deck.size() > 0) {
            int backOutput = deck.get(deck.size() - 1);
            deck.remove(deck.size() - 1);
            return backOutput;
        } else
            return -1;
    }
        
    static int frontView(ArrayList<Integer> deck) {
        if (deck.size() > 0) {
            int frontView = deck.get(0);
            return frontView;
        } else
            return -1;
    } 
    static int backView(ArrayList<Integer> deck) {

        if (deck.size() > 0) {
            int backView = deck.get(deck.size()-1);
            return backView;
        } else
            return -1;
    }
}
