package structural.flyweight.unitType.elf;

import structural.flyweight.unitType.Hunter;
import structural.flyweight.unitType.UnitType;

public class ElfHunter extends UnitType implements Hunter {
    @Override
    public void shot() {
        System.out.println("elf hunter shot");
    }
}
