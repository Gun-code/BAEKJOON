import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Merge {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int real[] = new int[count];

        for (int i = 0; i < count; i++) {
            real[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void divide(int n) {
        int count = n;
        int left, right;
        if()
        if (count / 2 == 1) {
            if (count % 2 == 0) {
                left = count / 2;
                right = count / 2;
            } else {
                left = count / 2 + 1;
                right = count / 2;
            }
        }else
        {
        
    }
    }
}
