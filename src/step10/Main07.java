package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a[] = new int[3];

        while (true) {
            int max = Integer.MIN_VALUE;
            int n = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                if (max < a[i]) {
                    max = a[i];
                    n = i;
                }
            }
            if (a[0] == 0) {
                if (a[0] == a[1])
                    if (a[1] == a[2])
                        break;
            }

            if (a[0] == a[1] && a[1] == a[2]) {
                System.out.println("Equilateral");
                continue;
            } else if (a[0] == a[1] || a[1] == a[2] || a[0] == a[2]) {
                if (n == 0) {
                    if (a[0] - a[1] - a[2] >= 0) {
                        System.out.println("Invalid");
                        continue;
                    } else {
                        System.out.println("Isosceles");
                        continue;
                    }
                } else if (n == 1) {
                    if (a[1] - a[0] - a[2] >= 0) {
                        System.out.println("Invalid");
                        continue;
                    } else {
                        System.out.println("Isosceles");
                        continue;
                    }
                } else if (n == 2) {
                    if (a[2] - a[1] - a[0] >= 0) {
                        System.out.println("Invalid");
                        continue;
                    } else {
                        System.out.println("Isosceles");
                        continue;
                    }
                }
            }
            if (n == 0) {
                if (a[0] - a[1] - a[2] >= 0) {
                    System.out.println("Invalid");
                    continue;
                } else {
                    System.out.println("Scalene");
                    continue;
                }
            } else if (n == 1) {
                if (a[1] - a[0] - a[2] >= 0) {
                    System.out.println("Invalid");
                    continue;
                } else {
                    System.out.println("Scalene");
                    continue;
                }
            } else if (n == 2) {
                if (a[2] - a[1] - a[0] >= 0) {
                    System.out.println("Invalid");
                    continue;
                } else {
                    System.out.println("Scalene");
                    continue;
                }
            }
        }

    }
}
