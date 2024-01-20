package Lesson19;

class DeluxeBurger extends Hamburger {
    private String chips;
    private String drink;

    DeluxeBurger() {
        super("Deluxe Burger", 8.99, "Mol go'shti");
        this.chips = "Lays";
        this.drink = "Coca Cola";
    }

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    public void customizeChips(String newChips) {
        this.chips = newChips;
        System.out.println("Uzingiz tanlagan chips: " + newChips);
    }

    public void customizeDrink(String newDrink) {
        this.drink = newDrink;
        System.out.println("siz tanlagan ichimlik: " + newDrink);
    }

    public void displayDetails() {
        System.out.println("Burger nomi: " + getName());
        System.out.println("Narxi: " + getPrice()+" sum");
        System.out.println("Go'sht: " + getMeat());
        System.out.println("Chips: " + chips);
        System.out.println("Ichimlik: " + drink);
    }
}

