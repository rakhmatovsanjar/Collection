package Lesson19;

class Hamburger {
    private String name;
    private double price;
    private String meat;

    Hamburger(String name, double price, String meat) {
        this.name = name;
        this.price = price;
        this.meat = meat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
