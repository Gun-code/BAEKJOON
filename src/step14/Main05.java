package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main05 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int arr[] = new int[num];
        ArrayList<Integer[]> nums = new ArrayList<>();
        ArrayList<Integer> com = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        nums.addAll(map(arr));

        st = new StringTokenizer(br.readLine());
        int mum = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nums.size(); i++) {
            com.add(nums.get(i)[0]);
        }
        for (int i = 0; i < mum; i++) {
            boolean sw = false;
            int compare = Integer.parseInt(st.nextToken());
            if (com.contains(compare)) {
                for (int j = 0; j < nums.size(); j++) {
                    if (nums.get(j)[0] == compare) {
                        System.out.printf("%d ", nums.get(j)[1]);
                        sw = true;
                    }
                }
            }
            if (sw == false) {
                System.out.printf("0 ");
            }

        }
    }

    public static ArrayList<Integer[]> map(int[] arr) {
        int value = 1;
        ArrayList<Integer[]> nums = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                value += 1;
            } else {
                Integer[] name = { arr[i - 1], value };
                nums.add(name);
                value = 1;
            }
        }

        Integer[] name = { arr[arr.length - 1], value };
        nums.add(name);

        return nums;
    }
}
