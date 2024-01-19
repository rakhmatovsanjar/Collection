package LinkedListTasks.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> futbol = new ArrayList<>();
        ArrayList<String> tenis = new ArrayList<>();

        futbol.add("Sanjar");
        futbol.add("Ramazon");
        futbol.add("Dilshod");

        tenis.add("Shaxzod");
        tenis.add("Ramazon");


        futbol.removeAll(tenis);
        System.out.println("faqat futbolga boradigan bollar ro'yxati: " + futbol);

        ArrayList<String> guruh = new ArrayList<>();
        guruh.addAll(futbol);
        guruh.addAll(tenis);
        System.out.println(guruh + " -> " + guruh.size() + " ta");
    }
}
