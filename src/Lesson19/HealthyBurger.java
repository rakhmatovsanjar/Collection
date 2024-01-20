package Lesson19;
class HealthyBurger extends Hamburger {
    private final String[] additionalItems;
    private final int maxAdditionalItems;

    HealthyBurger() {
        super("Healthy Burger", 7.49, "Kurka go'shti");
        this.maxAdditionalItems = 6;
        this.additionalItems = new String[maxAdditionalItems];
    }
    public String[] getAdditionalItems() {
        return additionalItems;
    }
    public void addAdditionalItem(String item) {
        for (int i = 0; i < maxAdditionalItems; i++) {
            if (additionalItems[i] == null) {
                additionalItems[i] = item;
                System.out.println(item + " Sog'lom Burgerga qo'shildi.");
                return;
            }
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

