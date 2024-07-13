package M1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Bridge bridge = new Bridge();

        bridge.load();
        bridge.buildBridge();
        System.out.println(bridge.sb.toString());
    }
}

class Bridge {
    private BufferedReader br;
    private StringTokenizer st;
    StringBuilder sb;
    private int[][] site;
    private int testCount;
    

    public Bridge() {

        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
    }
    
    public void buildBridge() {
        long westSite, eastSite;  
        for (int i = 0; i < testCount; ++i) {
            westSite = site[i][0];
            eastSite = site[i][1];
            if(westSite - eastSite == 0)
                sb.append("1\n");
            else if (westSite == 0 || eastSite == 0) 
                sb.append("0\n");
            else {
                BigInteger m, n, k;
                m = factorial(westSite);
                n = factorial(eastSite);
                k = factorial(eastSite - westSite);
                BigInteger result = n.divide(m.multiply(k));
                sb.append(result + "\n");
            }
        }
    }

    private BigInteger factorial(long num) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public void load() throws IOException {
        st = new StringTokenizer(br.readLine());
        testCount = Integer.parseInt(st.nextToken());

        site = new int[testCount][2];
        for (int i = 0; i < testCount; ++i) {
            st = new StringTokenizer(br.readLine());
            site[i][0] = Integer.parseInt(st.nextToken());
            site[i][1] = Integer.parseInt(st.nextToken());
        }
    }
}