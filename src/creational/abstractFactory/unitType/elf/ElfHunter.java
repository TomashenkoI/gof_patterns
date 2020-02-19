package creational.abstractFactory.unitType.elf;

import creational.abstractFactory.unitType.Hunter;

public class ElfHunter implements Hunter {
    @Override
    public void shot() {
        System.out.println("elf hunter shot");
    }
}
