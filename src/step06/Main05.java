package step06;


    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main05 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine(); //입력 문자 읽어옴.
            int max = Integer.MIN_VALUE;
            int n = Integer.MIN_VALUE;

            int[] arr = new int[str.length()]; // 읽어온 문자열
            int[] arr1 = new int[26]; //알파벳 A-Z

            for (int i = 0; i < str.length(); i++) {
                if((int)str.charAt(i)<97){
                    arr[i] = (int) (str.charAt(i));
            } else if ((int) str.charAt(i) > 96) {
                arr[i] = (int) (str.charAt(i)) - 32;
            }//읽어온 문자 모두 대문자 저장
            }
            for (int i = 0; i < str.length(); i++) {
                arr1[arr[i] - 65] += 1;
                if (max < arr1[arr[i] - 65]) {
                    max = arr1[arr[i] - 65];
                    n = arr[i];
                } else if (max == arr1[arr[i] - 65]) {
                    n = Integer.MAX_VALUE;
                }
            }
            if(n<97){
                System.out.printf("%c", (int)n);
            }else if(97<n){
                System.out.println("?");
            }
        }
    }