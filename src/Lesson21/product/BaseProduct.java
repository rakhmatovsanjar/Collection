package Lesson21.product;

import Lesson21.product_type.GarnirType;
import Lesson21.product_type.ProductType;

public abstract class BaseProduct {
    private ProductType productType;
    private GarnirType garnirType;
    private int price;
    private int count;

    public BaseProduct(GarnirType garnirType, int price, int count) {
        this.garnirType = garnirType;
        this.price = price;
        this.count = count;
    }

    public BaseProduct(ProductType productType, int count) {
        this.productType = productType;
        this.count = count;
    }

    public BaseProduct(GarnirType garnirType, int count) {
        this.garnirType = garnirType;
        this.count = count;
    }

    public BaseProduct(ProductType productType, int price, int count) {
        this.productType = productType;
        this.price = price;
        this.count = count;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public GarnirType getGarnirType() {
        return garnirType;
    }

    public void setGarnirType(GarnirType garnirType) {
        this.garnirType = garnirType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void decrementCount(int count) {
        this.count -= count;
    }

    public void incrementCount(int count) {
        this.count += count;
    }

    @Override
    public String toString() {
        return "BaseProduct{" +
                "productType=" + productType +
                ", garnirType=" + garnirType +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
