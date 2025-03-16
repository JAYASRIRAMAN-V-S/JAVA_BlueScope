package CollectionFrameWork;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("JAYA SRI RAMAN");
        list.add("Apple");
        list.size();
        System.out.println("Element " + list.get(0));

        list.remove("Apple");
        System.out.println(list);

        list.clear();

    }
}
