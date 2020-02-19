package creational.abstractFactory.unitType.elf;

import creational.abstractFactory.unitType.Wizard;

public class ElfWizard implements Wizard {
    @Override
    public void cast() {
        System.out.println("elf wizard cast");
    }
}
