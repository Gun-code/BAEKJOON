import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double d = 0.0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String sub = st.nextToken();
            a = Double.parseDouble(st.nextToken());
            String str = st.nextToken();

            if(str.equals("A+")){
                b += a * 4.5;
                d += a;
            }if(str.equals("A0")){
                b += a*4.0;
                d += a;
            }if(str.equals("B+")){
                b += a*3.5;
                d += a;
            }if(str.equals("B0")){
                b += a*3.0;
                d += a;
            }if(str.equals("C+")){
                b += a*2.5;
                d += a;
            }if(str.equals("C0")){
                b += a*2.0;
                d += a;
            }if(str.equals("D+")){
                b += a*1.5;
                d += a;
            }if(str.equals("D0")){
                b += a*1.0;
                d += a;
            }if(str.equals("F")){
                b += a*0.0;
                d += a;
            }if(str.equals("P")){
                continue;
            }
                
            }
            c = b/d;
            System.out.printf("%.6f",c);
        
        
    }
}
