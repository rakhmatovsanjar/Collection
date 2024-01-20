package Lesson19;

import java.util.ArrayList;
import java.util.List;
class AdditionalServices {
    void offerDeliveryService() {
        System.out.println("Yetkazib berish xizmati qo'shimcha haq evaziga mavjud.");
    }

    void offerDiscountCoupon() {
        System.out.println("Keyingi xaridingiz uchun 10% chegirmali kuponga ega bo'ling!");
    }
}

class KingBurgers implements Actions {
    private final List<Hamburger> burgers;
    private final AdditionalServices additionalServices;

    KingBurgers() {
        this.burgers = new ArrayList<>();
        this.additionalServices = new AdditionalServices();
    }

    void addBurger(Hamburger burger) {
        burgers.add(burger);
    }

    @Override
    public void sellBurger(Hamburger burger) {
        if (burgers.contains(burger)) {
            System.out.println("Sotish " + burger.getName() + " sum " + burger.getPrice());
            System.out.println("Yoqimli ishtaha!");

            if (burger instanceof DeluxeBurger) {
                System.out.println("Siz bilan Deluxe Burger sotib oldingiz " +
                        ((DeluxeBurger) burger).getChips() + " va " +
                        ((DeluxeBurger) burger).getDrink() + ".");
            } else if (burger instanceof HealthyBurger) {
                System.out.println("Siz quyidagi qo'shimcha narsalar bilan Sog'lom Burger sotib oldingiz:");
                for (String item : ((HealthyBurger) burger).getAdditionalItems()) {
                    if (item != null) {
                        System.out.println("- " + item);
                    }
                }
            }
            additionalServices.offerDeliveryService();
            additionalServices.offerDiscountCoupon();

        } else {
            System.out.println(burger.getName() + " menyuda mavjud emas.");
        }
    }

    public AdditionalServices getAdditionalServices() {
        return additionalServices;
    }
}

