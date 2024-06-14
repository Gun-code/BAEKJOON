package step06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int num = 1;
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                if (str.charAt(i-1) == 'c') {
                    num -= 1;                    
                } else if (str.charAt(i-1) == 'd') {
                    num -= 1;                    
                }
            } else if (str.charAt(i) == '=') {
                if (str.charAt(i - 1) == 'z') {
                    if (i >= 2 && str.charAt(i - 2) == 'd') {
                        num -= 1;
                    }
                    num -= 1;
                }else if(str.charAt(i - 1) == 'c'){
                    num -= 1;
                }else if(str.charAt(i - 1) == 's'){
                    num -= 1;
                }
            } else if (str.charAt(i) == 'j') {
                
                if (str.charAt(i - 1) == 'n') {
                    num -= 1;
                } else if (str.charAt(i - 1) == 'l') {
                    num -= 1;
                }

            }
            num += 1;
        }
        System.out.println(num);
    }
}
