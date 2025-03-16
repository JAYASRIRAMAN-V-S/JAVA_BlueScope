package CollectionFrameWork;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(20);
        set.add(80);
        set.add(30);
        set.add(10);

        System.out.println("Sorted Set: " + set);
        System.out.println("Smallest Element: " + set.first());
        System.out.println("Largest Element: " + set.last());
    }
}
