package Shunchaki;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(4);
        queue.add(7);
        queue.add(1);
        queue.add(3);
        System.out.println(queue);
    }
}
