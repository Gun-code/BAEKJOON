package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main07 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int num = Integer.parseInt(br.readLine());
    
    int[] card = new int[num];
    for( int i = 0; i < num; ++i )
      card[i] = i+1;

      int[] card_ = new int[num];
      int cardNum = card.length;
    while( 1 < cardNum ) {
      int index = 2;
      int temp = card[1];  
      --cardNum;
      for(int i = 0; i < cardNum-1; ++i){
        card[index-2] = card[index];
        ++index;
      }
      card[cardNum-1] = temp;
    }
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write(String.valueOf(card[0]));

    bw.flush();
    bw.close();
    br.close();
  }
}
