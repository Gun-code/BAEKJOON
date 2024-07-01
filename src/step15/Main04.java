    package step15;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.HashMap;

    public class Main04 {
        public static void main(String[] args) throws NumberFormatException, IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            int arr[] = new int[num];
            HashMap<Integer, Integer> gap = new HashMap<>();
            ArrayList<Integer> gapArr = new ArrayList<>();
            int gapNum = 0;
            if (num > 1) {
                for (int i = 0; i < num; i++) {
                    arr[i] = Integer.parseInt(br.readLine());
                    if (i >= 1) {
                        if (!(gap.containsKey(arr[i] - arr[i - 1]))) {
                            gap.put(arr[i] - arr[i - 1], 1);
                            gapArr.add(arr[i] - arr[i - 1]);
                            gapNum++;   

                        }
                    }
                }
                int result;
                if (gapNum > 1) {
                result = gcd(gapArr.get(0), gapArr.get(1));
            
                    for (int i = 2; i < gapNum; i++) {
                        result = gcd(result, gapArr.get(i));
                    }
                }else
                    result = gapArr.get(0);
                
                int maxNum;
                int minNum;
                if (arr[arr.length - 1] % result != 0){
                    maxNum = arr[arr.length - 1] / result + 1;
                    minNum = arr[0] / result;}
                else{
                    maxNum = arr[arr.length - 1] / result;
                    minNum = arr[0] / result-1;}


                System.out.println(maxNum - minNum - num);
            } else
                System.out.println("0");
        }

        public static int gcd(int a, int b) {
            int result;
            while (true) {
                result = a % b;
                if (result == 0)
                    break;
                a = b;
                b = result;
            }
            return b;
        }
    }
