package structural.flyweight.unitType.elf;

import structural.flyweight.unitType.UnitType;
import structural.flyweight.unitType.Warrior;

public class ElfWarrior extends UnitType implements Warrior {
    @Override
    public void hit() {
        System.out.println("elf warrior hit");
    }
}
