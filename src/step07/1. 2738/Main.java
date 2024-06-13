import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[][] = new int[n][m];

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    st = new StringTokenizer(br.readLine());
                    for (int k = 0; k < m; k++) {
                        arr[j][k] = Integer.parseInt(st.nextToken());

                    }
                }
            } else if (i == 1) {
                for (int j = 0; j < n; j++) {
                    st = new StringTokenizer(br.readLine());
                    for (int k = 0; k < m; k++) {
                        arr[j][k] += Integer.parseInt(st.nextToken());

                    }
                }

            } else if (i == 2) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        System.out.printf("%d ", arr[j][k]);

                    }
                    System.out.println();
                }

            }
        }

    }

}
