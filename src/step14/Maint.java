package step14;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Maint {
    double ratio = 0.0;
    int num = 16;
    int count = 0;
    ArrayList<LinkedList<String[]>> array = new ArrayList<>(num);

    public static void main(String[] args) throws IOException {
    }

    public void hashSave(String key, String value) {
        String hashNum = String.valueOf(Objects.hash(key));
        String[] str = { key, value, hashNum };
        int listNum = Objects.hash(key) % num;
        LinkedList<String[]> linked = array.get(listNum);

        if (ratio > 0.75) {
            num = num * 2;
            ArrayList<LinkedList<String[]>> arrayP = new ArrayList<>(num);
            LinkedList<String[]> linkedP = array.get(listNum);
            for (int i = 0; i < num; i++) {
                arrayP.add(new LinkedList<>());
            }

            for (int i = 0; i < array.size(); i++) {
                for (int j = 0; j < linked.size(); j++) {
                    String[] afterStr = linked.get(i);
                    hashNum = linked.get(i)[3];
                    listNum = Objects.hash(key) % num;
                    linkedP.add(afterStr);
                }
            }
            array = new ArrayList<>(num);
            array = arrayP;
        }

        for (int i = 0; i < num; i++) {
            array.add(new LinkedList<>());
        }

        if (linked.get(listNum)[0] != null && !(linked.get(listNum)[0].isEmpty())) {
            if (linked.get(listNum)[0].equals(key)) {
                linked.get(listNum)[1] = value;
            } else if (!(linked.get(listNum)[0].equals(key))) {
                linked.add(str);
                count++;
            }
        } else {
            linked.add(str);
            count++;
        }
        ratio = (double) count / (double) num;
    }

    public String hashLoad(String key) {
        int hashnum = Objects.hash(key);
        int listNum = hashnum % num;
        LinkedList<String[]> linked = array.get(listNum);
        if (linked.get(listNum)[0] == null && linked.get(listNum)[0].isEmpty()) {
            return null;
        } else {
            for (int i = 0; i < linked.size(); i++) {
                if (linked.get(listNum)[0] == linked.get(i)[0]) {
                    return linked.get(listNum)[1];
                }
            }
            return null;
        }
    }
}
