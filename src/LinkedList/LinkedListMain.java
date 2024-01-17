package LinkedList;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("S");
        linkedList.add("a");
        linkedList.add("l");
        linkedList.add("o");
        linkedList.add("m");
        System.out.println(linkedList);
        linkedList.remove("l");
        System.out.println(linkedList);
    }
}
