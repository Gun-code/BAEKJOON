package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean r[][] = new boolean[8][8];
        boolean a[][] = new boolean[n][m];

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        r[i][j] = false;
                    } else {
                        r[i][j] = true;
                    }
                }

            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        r[i][j] = true;
                    } else {
                        r[i][j] = false;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < m; j++) {

                // System.out.println();
                System.out.println(str);
                // a[i][j] = (str.charAt(j) == 'W' ? true : false);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("===========================================");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(r[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                prove(i, j, boolean a[n][m], boolean r[n][m]);
            }
        }
        // System.out.println(min);
    }

    public static void prove(int x, int y,boolean a[][], boolean r[][]) throws IOException {

        int min = Integer.MAX_VALUE;
        int fix1 = 0;
        int fix2 = 0;

       
        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 8; l++) {
                if (a[x + k][y + l] != r[x + k][y + l]) {
                    fix1 += 1;
                }
                if (a[x + k][y + l] != !(r[x + k][y + k])) {
                    fix2 += 1;
                }
            }

        }
        if (fix1 >= fix2) {
            if (fix2 < min)
                min = fix2;
        } else {
            if (fix1 < min)
                min = fix1;
        }
        fix1 = 0;
        fix2 = 0;
        System.out.println(min);
    }

}
