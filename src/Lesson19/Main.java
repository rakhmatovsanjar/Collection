package Lesson19;

// Main class for testing
public class Main {
    public static void main(String[] args) {
        KingBurgers kingBurgers = new KingBurgers();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        kingBurgers.addBurger(deluxeBurger);
        System.out.println("\n----------------------------\n");

        HealthyBurger healthyBurger = new HealthyBurger();
        kingBurgers.addBurger(healthyBurger);
        System.out.println("\n----------------------------\n");
        kingBurgers.sellBurger(deluxeBurger);
        System.out.println("\n----------------------------\n");
        kingBurgers.sellBurger(healthyBurger);
        System.out.println("\n----------------------------\n");

        // Customizing DeluxeBurger
        deluxeBurger.customizeChips("Doritos");
        deluxeBurger.customizeDrink("Pepsi");
        deluxeBurger.displayDetails();
        System.out.println("\n----------------------------\n");
        healthyBurger.addAdditionalItem("Lettuce");
        healthyBurger.addAdditionalItem("Cheese");
        healthyBurger.displayDetails();
        System.out.println("\n----------------------------\n");
        kingBurgers.getAdditionalServices().offerDeliveryService();
        System.out.println("\n----------------------------\n");
        kingBurgers.getAdditionalServices().offerDiscountCoupon();
        System.out.println("\n----------------------------\n");
    }
}


