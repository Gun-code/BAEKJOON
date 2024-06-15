package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int a = 0;
        int sum = n;

        for (; a < 30; a++) { // 제곱 승수 구하기
            int h = (int) (sum - Math.pow(b, a));
            if (h < 0) {
                break;
            } else if (h == 0) {
                a++;
                break;
            }
        }

        for (; a > 0; a--) { // 승수 = 자리수
            for (int i = 0; i < b + 1; i++) { //
                int score;

                if (sum < b && a == 1) {
                    if (sum > 9) {
                        System.out.printf("%c", sum + 55);
                        sum = 0;
                        break;
                    } else if (sum > b && a == 1) {
                        System.out.printf("%d", sum);
                        sum = 0;
                        break;
                    }
                }
                score = (int) (sum - i * Math.pow(b, a - 1));
                if (score < 0) {
                    --i;
                    sum = (int) (sum - i * Math.pow(b, a - 1));
                    if (i > 9) {
                        System.out.printf("%c", i + 55);
                        break;
                    } else {
                        System.out.printf("%d", i);
                        break;
                    }
                }else if (score == 0) {
                    sum = (int) (sum - i * Math.pow(b, a - 1));
                    if (i > 9) {
                        System.out.printf("%c", i + 55);
                        break;
                    } else {
                        System.out.printf("%d", i);
                        break;
                    }
                    
                }

            }
        }
    }

}
