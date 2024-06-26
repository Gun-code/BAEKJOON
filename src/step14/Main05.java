package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main05 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());         //상근이 카드 수 num
        int arr[] = new int[num];                           //상근이 카드 뭉치 arr[]
        HashMap<Integer, Integer> hMap = new HashMap<>();   //카드 별 갯수     hMap

        st = new StringTokenizer(br.readLine());    //상근이 카드 뭉치 채우기
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);                           //상근이 카드 뭉치 정렬
        hMap = map(arr);                            //상근이 카드 별 갯수 정리

        st = new StringTokenizer(br.readLine());    
        int mum = Integer.parseInt(st.nextToken()); //비교 카드 수 mum
        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mum; i++) {             //상근이 카드가 비교 카드에 있는지 찾기
            int compare = Integer.parseInt(st.nextToken());
            if (hMap.get(compare) != null) {        //카드가 있으면 카드 갯수 출력
                sb.append(hMap.get(compare)).append(" ");
            }else {                                 //카드가 없으면 0 출력
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }

    public static HashMap<Integer, Integer> map(int[] arr) { //상근이 카드 정렬 후 
        int value = 1;

        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                value += 1;
            } else {
                hMap.put(arr[i-1],value);
                value = 1;
            }
        }
        hMap.put(arr[arr.length - 1],value);

        return hMap;
    }
}
