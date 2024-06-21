package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m;
        int a[] = new int[n];

        if (n % 4 == 1)
            m = n / 4 + 1;
        else if (n % 4 == 2)
            m = n / 4 + 2;
        else if (n % 4 == 3)
            m = n / 4 + 3;
        else
            m = n / 4;

        int d1[] = new int[n / 4];
        int d2[] = new int[n / 4];
        int d3[] = new int[n / 4];
        int d4[] = new int[m];

        int num1, num2, num3, num4;

        if (n <= 4) {

            for (int i = 0; i < n; i++) {
                d1[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < n + 1; i++) {
                for (int j = 0; j < n; j++) {
                    if (d1[i] > d1[j]) {
                        num1 = d1[i];
                        d1[i] = d1[j];
                        d1[j] = num1;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(d1[i]);
            }
        } else {
            for (int i = 0; i < n; i++) {
                int q = 0;
                int w = 0;
                int e = 0;
                int r = 0;

                if (i < (n / 4)) {
                    d1[q] = Integer.parseInt(br.readLine());
                    q++;
                } else if (i < (n / 2)) {
                    d2[w] = Integer.parseInt(br.readLine());
                    w++;
                } else if (i < (n - m)) {
                    d3[e] = Integer.parseInt(br.readLine());
                    e++;
                } else {
                    d4[r] = Integer.parseInt(br.readLine());
                    r++;
                }
            }
            {
                for (int i = 0; i < d1.length; i++) {
                    System.out.println(d1[i]);
                }
            }{
                for (int i = 0; i < d2.length; i++) {
                    System.out.println(d2[i]);
                }
            }{
                for (int i = 0; i < d3.length; i++) {
                    System.out.println(d3[i]);
                }
            }{
                for (int i = 0; i < d4.length; i++) {
                    System.out.println(d4[i]);
                }
            }

            for (int i = 0; i < (n / 4) - 1; i++) {
                for (int j = i + 1; j < n / 4; j++) {
                    if (d1[i] > d1[j]) {
                        num1 = d1[i];
                        d1[i] = d1[j];
                        d1[j] = num1;
                    }

                    if (d2[i] > d2[j]) {
                        num2 = d2[i];
                        d2[i] = d2[j];
                        d2[j] = num2;
                    }

                    if (d3[i] > d3[j]) {
                        num3 = d3[i];
                        d3[i] = d3[j];
                        d3[j] = num3;
                    }

                }
            }
            for (int i = 0; i < (n / 4) - 1; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (d4[i] > d4[j]) {
                        num4 = d4[i];
                        d4[i] = d4[j];
                        d4[j] = num4;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                int q = 0;
                int w = 0;
                int e = 0;
                int r = 0;

                while (true) {
                    if ((d1[q] < d2[w]) && (d3[e] < d4[r])) {
                        if (d1[q] < d3[e]) {
                            a[i] = d1[q];
                            q++;
                            break;
                        } else {
                            a[i] = d3[e];
                            q++;
                            break;
                        }
                    } else if ((d1[q] > d2[w]) && (d3[e] > d4[r])) {
                        if (d2[w] < d4[r]) {
                            a[i] = d2[w];
                            q++;
                            break;
                        } else {
                            a[i] = d4[r];
                            q++;
                            break;
                        }
                    }
                }
            }
            // for (int i = 0; i < n; i++) {
            //     System.out.println(a[i]);
            // }
        }
    }
}
