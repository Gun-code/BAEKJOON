package M16120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringFind sf = new StringFind(br.readLine());
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(sf.find())
            bw.write("PPAP");
        else
            bw.write("NP");
        
        bw.flush();
        bw.close();
        br.close();
    }
}

class StringFind{

    private final String line;

    public StringFind(String line) {
        this.line = line;
    }

    public boolean find() {
        
    }
    
}