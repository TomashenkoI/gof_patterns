package structural.composite.impl;

import structural.composite.BaseUnit;

public class RangedUnit extends BaseUnit {

    public RangedUnit(int posX, int posY) {
        super(posX, posY);
    }

    public void shot() {
        System.out.println("ranged unit shot");
    }

}
