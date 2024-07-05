package step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main05 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] waitLine = new int[count];
        for ( int i = 0; i < count; ++i ) 
            waitLine[i] = Integer.parseInt(st.nextToken());
        

        int[] tempLine = new int[count];
        Boolean result = true;
        int waitIndex = 0;
        int tempIndex = 0;
        int index = 1;
        while ( index < waitLine.length ) {

            if ( index == waitLine[waitIndex] ) {
                if (waitIndex < waitLine.length - 1)
                    ++waitIndex;
                ++index;
                continue;
            } else if ( 1 < tempIndex && tempLine[tempIndex-2] <= tempLine[tempIndex-1] ) {
                result = false;
                break;
            } else if ( 0 < tempIndex && index == tempLine[tempIndex-1] ) {
                --tempIndex;
                ++index;
                continue;
            } else if ( waitIndex < waitLine.length && index != waitLine[waitIndex] ) {
                if(tempIndex < waitLine.length){
                    tempLine[tempIndex] = waitLine[waitIndex];
                    ++tempIndex;
                }
                if (waitIndex < waitLine.length - 1)
                    ++waitIndex;
                continue;
            }
        }
        if ( result )
            System.out.println("Nice");
        else
            System.out.println("Sad");

    }
}
