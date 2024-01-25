package Lesson21.hamburger;

import Lesson21.product.Garnir;
import Lesson21.product_type.GarnirType;

import java.util.ArrayList;
import java.util.List;

public class Simple implements Hamburger {

    private final int count;
    private final List<Garnir> garnirs = new ArrayList<>();

    public Simple(int count) {
        this.count = count;
        garnirs.add(new Garnir(GarnirType.SALAD, 1));
    }

    public void addGarnir(List<Garnir> iGarnirs) {
        if (!iGarnirs.isEmpty()) {
            garnirs.clear();
            garnirs.addAll(iGarnirs);
        }
    }

    @Override
    public String toString() {
        return "Simple{" +
                "count=" + count +
                ", garnirs=" + garnirs +
                '}';
    }
}
