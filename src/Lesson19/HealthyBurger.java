package Lesson19;

import java.util.ArrayList;

class HealthyBurger extends Hamburger {
    private final ArrayList<String> additionalItems;
    private final int maxAdditionalItems;

    HealthyBurger() {
        super("Healthy Burger", 7.49, "Kurka go'shti");
        this.maxAdditionalItems = 6;
        this.additionalItems = new ArrayList<>();
    }
    public ArrayList<String> getAdditionalItems() {
        return additionalItems;
    }
    public void addAdditionalItem(String item) {
        if (additionalItems.size()<=maxAdditionalItems){
            additionalItems.add(item);
        }
        System.out.println("Kechirasiz, siz ortiq qo'sha olmaysiz " + maxAdditionalItems + " qo'shimcha elementlar.");
    }

    public void displayDetails() {
        System.out.println("Burger nomi: " + getName());
        System.out.println("Narxi: " + getPrice()+" sum");
        System.out.println("Go'sht: " + getMeat());
        System.out.println("Qo'shimcha elementlar:");
        for (String item : additionalItems) {
            if (item != null) {
                System.out.println("- " + item);
            }
        }
    }
}

