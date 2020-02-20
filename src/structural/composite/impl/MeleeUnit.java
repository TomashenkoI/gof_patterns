package structural.composite.impl;

public class MeleeUnit extends BaseUnit {

    public MeleeUnit(int posX, int posY) {
        super(posX, posY);
    }

    public void attack() {
        System.out.println("melee unit attack");
    }

}
