package ArrayList;

import java.util.*;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Sanjar");
        arrayList1.add("Ramazon");
        arrayList1.add("Shaxzod");
        arrayList1.add("Mirjamol");
        arrayList1.add("Suxrob");
        System.out.println(arrayList1);

        arrayList1.add(1, "Komil");
        System.out.println(arrayList1);

        arrayList1.set(1, "Dilshod");
        System.out.println(arrayList1);

        /**
         // arrayList1.clear();
         // System.out.println(arrayList1);
         */

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("1");
        arrayList2.add("2");
        arrayList2.add("3");
        arrayList2.add("4");
        arrayList2.add("5");
        arrayList2.add("6");
        System.out.println(arrayList2);


        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
        arrayList1.addAll(3, arrayList2);
        System.out.println(arrayList1);
        arrayList1.remove("3");
        System.out.println(arrayList1);
        arrayList1.removeIf(s -> s.equals("4"));
        System.out.println(arrayList1);
        System.out.println(arrayList1.size());
        System.out.println(arrayList1.get(8));
        System.out.println(arrayList1.lastIndexOf("2"));
        System.out.println(arrayList1.indexOf("2"));
        System.out.println(arrayList1.contains("Ramazon"));
        System.out.println(arrayList1.contains("4"));
        System.out.println(arrayList1.removeAll(arrayList2));
        System.out.println(arrayList1);
        Collections.sort(arrayList1);
        System.out.println(arrayList1);
    }
}
