package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main06 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count =  Integer.parseInt(br.readLine());
    
  int[] queueArr = new int[count];
  int startIndex = 0;
  int endIndex = 0;
  ArrayList<Integer> result = new ArrayList<>();
    for( int i = 0; i < count; ++i ) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String commend = st.nextToken();

      switch (commend) {
        case "push":
          {
            queueArr[endIndex] = Integer.parseInt(st.nextToken());
            ++endIndex;
            break;
          }
        case "pop":
        {
          if ( endIndex - startIndex == 0 ) 
            result.add(-1);
          else{
            result.add(queueArr[startIndex]);
            ++startIndex;
          }
          break;
        }
        case "size":
        {
          result.add(endIndex - startIndex);
          break;
        }
        case "empty":
        {
          if( endIndex-startIndex == 0 )
            result.add(1);
          else
            result.add(0);
          break;
        }
        case "front":
        {
          if( endIndex-startIndex == 0 )
            result.add(-1);
          else
            result.add(queueArr[startIndex]);
          break;
        }
        case "back":
        {
          if( endIndex-startIndex == 0 )
            result.add(-1);
          else
            result.add(queueArr[endIndex-1]);

          break;
        }
      }
    }
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for( int i = 0; i < result.size(); ++i ) {
      bw.write(result.get(i)+"\n");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}