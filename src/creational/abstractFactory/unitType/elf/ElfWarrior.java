package creational.abstractFactory.unitType.elf;

import creational.abstractFactory.unitType.Warrior;

public class ElfWarrior implements Warrior {
    @Override
    public void hit() {
        System.out.println("elf warrior hit");
    }
}
