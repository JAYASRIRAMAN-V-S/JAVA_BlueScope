package CollectionFrameWork;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");

        System.out.println("LinkedHashSet: " + set);
    }
}
