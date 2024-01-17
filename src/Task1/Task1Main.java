package Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1Main {
    public static void main(String[] args) {
        List<String> studetns = new ArrayList<>();
        studetns.add("Sanjarbek");
        studetns.add("Abbos");
        studetns.add("Komil");
        studetns.add("Suxrob");
        studetns.add("Diyorbek");
        System.out.println(studetns);

        List<String> onDutyStudents = new ArrayList<>();
        onDutyStudents.add("Mirjamol");
        onDutyStudents.add("Suxrob");
        System.out.println(onDutyStudents);

        studetns.forEach(student -> {
            if (onDutyStudents.contains(student)) {
                onDutyStudents.remove(student);
                System.out.println("Kelmagan navbatchi: " + onDutyStudents);
            }
        });
    }
}
