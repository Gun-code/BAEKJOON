package step15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 2, 3, 5));
        ArrayList<Integer> test1 = new ArrayList<>(list1);
        ArrayList<Integer> test2 = new ArrayList<>(list1);
        test1.add(10);
        test1.retainAll(list2);
        for (int i = 0; i < test1.size(); i++) {
            System.out.println(test1.get(i));
        }
        System.out.println("-----------------------");
        test2.removeAll(test1);
        test2.add(10);
        test2.addAll(list2);
        test2.removeAll(test1);
        for (int i = 0; i < test2.size(); i++) {
            System.out.println(test2.get(i));
        }

    }
}