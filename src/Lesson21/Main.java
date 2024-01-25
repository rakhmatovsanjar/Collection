package Lesson21;

import Lesson21.db.KingBurgersDB;
import Lesson21.hamburger.Hamburger;
import Lesson21.hamburger.Simple;
import Lesson21.product.BaseProduct;
import Lesson21.product.Garnir;
import Lesson21.product.Meet;
import Lesson21.product.RulonBread;
import Lesson21.product_type.GarnirType;
import Lesson21.product_type.ProductType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Garnir> userChoseGarnirs = new ArrayList<>();
    private static final List<Hamburger> userChoseHamburgers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        KingBurgersDB db = KingBurgersDB.getInstance();

        List<BaseProduct> products = new ArrayList<>();
        products.add(new Meet(ProductType.MEET, 10_000, 5));
        products.add(new RulonBread(ProductType.RULON_BREAD, 3_000, 5));
        products.add(new Garnir(GarnirType.SALAD, 2_000, 5));
        products.add(new Garnir(GarnirType.TOMATO, 1_000, 5));

        db.setProducts(products);

        boolean isChooseHamburger = true;
        boolean isChooseHamburgerAgain = false;
        while (isChooseHamburger) {
            if (!isChooseHamburgerAgain) {
                System.out.println("Hamburger tanlang!");
                System.out.println("1) Simple burger 2) Other burgers 3) Quit");
            } else {
                System.out.println("Hamburger yana tanlaysizmi!");
                System.out.println("1) Simple burger 2) Other burgers 3) Quit");
            }
            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.println("Nechta tanlaysan");
                    int counterHamburger = scanner.nextInt();
                    choseSimpleBurger(scanner, db, counterHamburger);
                    isChooseHamburgerAgain = true;
                }
                case 2 -> {
                    choseOtherBurger();
                    System.out.println("Hali implement qilinmagan");
                }
                default -> {
                    isChooseHamburger = false;
                    System.out.println("Siz tizimdan chiqdingiz!");
                }
            }
        }
    }

    private static void choseOtherBurger() {

    }

    private static int getCost(GarnirType garnirType, KingBurgersDB db) {
        for (int i = 0; i < db.getProducts().size(); i++) {
            BaseProduct baseProduct = db.getProducts().get(i);
            if (baseProduct.getGarnirType() != null) {
                if (baseProduct.getGarnirType().equals(garnirType)) {
                    return baseProduct.getPrice();
                }
            }
        }
        return 0;
    }

    private static void choseSimpleBurger(Scanner scanner, KingBurgersDB db,int counterHamburger) {
        boolean isChooseGarnir = true;
        boolean isChooseAgainGarnir = false;
        while (isChooseGarnir) {
            if (!isChooseAgainGarnir) {
                System.out.println("Garnir tanlaysizmi!");
                System.out.println("1) Ha 2) Yoq");
            } else {
                System.out.println("Garnir yana tanlaysizmi!");
                System.out.println("1) Ha 2) Yoq");
            }
            switch (scanner.nextInt()) {
                case 1 -> {
                    for (int i = 0; i < GarnirType.values().length; i++) {
                        System.out.println((i + 1) + ") " + GarnirType.values()[i] + " | Narx : " + getCost(GarnirType.values()[i], db));
                    }
                    int chooseGarnirUser = scanner.nextInt() - 1;
                    GarnirType choseGarnirType = GarnirType.values()[chooseGarnirUser];
                    userChoseGarnirs.add(new Garnir(choseGarnirType, 1));
                    isChooseAgainGarnir = true;
                }
                case 2 -> {
                    isChooseGarnir = false;
                    isChooseAgainGarnir = false;
                    Simple simpleHamburger = new Simple(counterHamburger);
                    simpleHamburger.addGarnir(userChoseGarnirs);
                    userChoseHamburgers.add(simpleHamburger);
                    userChoseGarnirs.clear();
                    System.out.println(userChoseHamburgers);
                }
            }
        }
    }
}