package Lesson21.db;

import Lesson21.product.BaseProduct;
import Lesson21.product.Garnir;
import Lesson21.product.Meet;
import Lesson21.product.RulonBread;
import Lesson21.product_type.GarnirType;
import Lesson21.product_type.ProductType;

import java.util.ArrayList;
import java.util.List;

public class KingBurgersDB {
    private static KingBurgersDB instance = null;
    private List<BaseProduct> products = new ArrayList<>();

    private KingBurgersDB() {
        products.add(new Meet(ProductType.MEET, 10_000, 10));
        products.add(new RulonBread(ProductType.RULON_BREAD, 3_000, 10));
        products.add(new Garnir(GarnirType.SALAD, 2_000, 10));
        products.add(new Garnir(GarnirType.TOMATO, 1_000, 10));
        products.add(new Garnir(GarnirType.CARROT, 1_000, 10));
        products.add(new Garnir(GarnirType.CHEESE, 5_000, 10));
    }

    public void setProducts(List<BaseProduct> iProducts) {
        for (int i = 0; i < iProducts.size(); i++) {
            BaseProduct inputBaseProduct = iProducts.get(i);
            for (int j = 0; j < getProducts().size(); j++) {
                BaseProduct product = getProducts().get(j);
                if (inputBaseProduct.getProductType() != null && product.getProductType() != null) {
                    if (inputBaseProduct.getProductType().equals(product.getProductType())) {
                        product.incrementCount(inputBaseProduct.getCount());
                    }
                }
                if (inputBaseProduct.getGarnirType() != null && product.getGarnirType() != null) {
                    if (inputBaseProduct.getGarnirType().equals(product.getGarnirType())) {
                        product.incrementCount(inputBaseProduct.getCount());
                    }
                }
            }
        }
    }

    public static KingBurgersDB getInstance() {
        if (instance == null) {
            instance = new KingBurgersDB();
        }
        return instance;
    }

    public List<BaseProduct> getProducts() {
        return products;
    }
}
