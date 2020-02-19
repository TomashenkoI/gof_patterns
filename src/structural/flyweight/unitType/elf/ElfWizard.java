package structural.flyweight.unitType.elf;

import structural.flyweight.unitType.UnitType;
import structural.flyweight.unitType.Wizard;

public class ElfWizard extends UnitType implements Wizard {
    @Override
    public void cast() {
        System.out.println("elf wizard cast");
    }
}
