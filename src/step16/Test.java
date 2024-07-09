package step16;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("C:/A/BAEKJOON/src/step16/data/4.txt")));
                bw.write("1000000\n");
                for (int i = 0; i < 1000000; i++) {
                    bw.write("7\n");
                }
                bw.flush();
                bw.close();

    }
}
