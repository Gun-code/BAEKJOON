package step16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> result = new ArrayList<>();
        while (true) {
            String inputString = br.readLine();
            if (inputString.charAt(0) == '.')
                break;
            else
                result.add(proof(inputString));
        }

        for (int i = 0; i < result.size(); i++) {
            bw.write(result.get(i) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

    public static String proof(String inputString) {

        ArrayList<Integer> bigIndex = new ArrayList<>();
        ArrayList<Integer> smallIndex = new ArrayList<>();
        int size = inputString.length();
        for (int i = 0; i < size; ++i) {
            if (inputString.charAt(i) == '(')
                smallIndex.add(i);
            else if (inputString.charAt(i) == ')') {

                if (smallIndex.size() > 0 && bigIndex.size() > 0) {
                    if (smallIndex.get(smallIndex.size() - 1) < bigIndex.get(bigIndex.size() - 1))
                        return "no";

                } else if (smallIndex.size() == 0)
                    return "no";
                smallIndex.remove(smallIndex.size() - 1);

            } else if (inputString.charAt(i) == '[')
                bigIndex.add(i);
            else if (inputString.charAt(i) == ']') {
                if (smallIndex.size() > 0 && bigIndex.size() > 0) {
                    if (smallIndex.get(smallIndex.size() - 1) > bigIndex.get(bigIndex.size() - 1))
                        return "no";
                } else if (bigIndex.size() == 0)
                    return "no";
                bigIndex.remove(bigIndex.size() - 1);

            }
        }
        if (bigIndex.size() == 0 && smallIndex.size() == 0) 
            return "yes";
        else
        return "no";
    }
}
