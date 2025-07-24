package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> hap = new HashSet<>(set1);
        hap.addAll(set2);
        System.out.println("hap = " + hap);

        Set<Integer> kyo = new HashSet<>(set1);
        kyo.retainAll(set2);
        System.out.println("kyo = " + kyo);

        Set<Integer> cha = new HashSet<>(set1);
        cha.removeAll(set2);
        System.out.println("cha = " + cha);
    }
}
