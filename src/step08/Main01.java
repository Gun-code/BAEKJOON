    package step08;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class Main01 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            int arr[] = new int[str.length()];
            long sum = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)-'0' < 10) {
                    arr[i] = str.charAt(i) - '0';
                } else {
                    arr[i] = (str.charAt(i)) - 55;
                }
            }
            for (int i = 0; i < str.length(); i++) {
                sum = (long) (sum + arr[i] * (Math.pow(b, (str.length()-i-1))));
            }
            System.out.println(sum);
        }
    }
