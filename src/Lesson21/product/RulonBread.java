package Lesson21.product;

import Lesson21.product_type.ProductType;

public class RulonBread extends BaseProduct {
    public RulonBread(ProductType productType, int price, int count) {
        super(productType, price, count);
    }

    public RulonBread(ProductType productType, int count) {
        super(productType, count);
    }
}
