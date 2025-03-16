package CollectionFrameWork;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("First");
        list.add(1, "Second");
        list.addLast("Last");

//      Accessing the elements
        list.getFirst();
        list.getLast();

//      Removing the elements
        list.remove("Last");

//      Traversing
        for(String animal : list){
            System.out.println(animal);
        }
    }
}
