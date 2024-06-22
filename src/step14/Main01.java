package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main01 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mynum = Integer.parseInt(br.readLine());
        int mycard[] = new int[mynum];
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < mynum; i++) {
            mycard[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(mycard);
        int num = Integer.parseInt(br.readLine());
        

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            sb.append(binSearchCourse(mycard, Integer.parseInt(st.nextToken())) + " ");

        }
        System.out.println(sb);
    }

    public static int binSearchCourse(int[] arr, int key) {
        int answer = -1;
        // [STEP1] 시작 인덱스와 마지막 인덱스 값을 지정합니다.
        int low = 0;
        int high = arr.length - 1;

        // [STEP2] 마지막 인덱스를 보다 첫번째 인덱스가 같아지거나 작을 경우까지 순회합니다.
        while (low <= high) {

            // [STEP3] 중간 값을 구합니다.
            int mid = (low + high) / 2;

            // [CASE4-1] 중간 값보다 찾으려는 값(key)가 큰 경우 : 중간 값에 1을 더하여 오른쪽 절반을 탐색합니다.
            if (arr[mid] < key) {
                low = mid + 1;
            }
            // [CASE4-2] 중간 값보다 찾으려는 값(key)가 작은 경우 : 중간값에 1을 빼서 왼쪽 절반을 탐색합니다.
            else if (arr[mid] > key) {
                high = mid - 1;
            }
            // [CASE4-3] 해당 경우가 아니면 중간값을 최종 값으로 반환합니다.
            else {
                answer = mid;
                break;
            }
        }
        // [STEP5] 최종 탐색을 하지 못할 경우 -1을 반환합니다.
        if (answer == -1)
            return 0;
        else
            return 1;
    }
}
