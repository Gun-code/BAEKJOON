package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main03 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        String str[] = new String[count];
        Boolean verify[] = new Boolean[count];

        for (int i = 0; i < count; ++i) {
            str[i] = br.readLine();
            int front = 0;
            int back = 0;
            for (int j = 0; j < str[i].length(); ++j) {
                if (front < back) {
                    verify[i] = false;
                } else {
                    if (str[i].charAt(j) == '(') {
                        front++;
                        if (j == str[i].length() - 1) {
                            verify[i] = false;
                        }

                    } else if (str[i].charAt(j) == ')') {
                        back++;
                        if (j == str[i].length() - 1) {
                            if (front == back) {
                                verify[i] = true;
                            } else {
                                verify[i] = false;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < count; i++) {
            if (verify[i])
                bw.write("YES\n");
            else
                bw.write("NO\n");
        }
        bw.flush();
        
        br.close();
        bw.close();
    }
}
