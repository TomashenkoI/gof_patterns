package creational.abstractFactory.unitFactory.impl;

import creational.abstractFactory.unitFactory.UnitFactory;
import creational.abstractFactory.unitType.Hunter;
import creational.abstractFactory.unitType.Warrior;
import creational.abstractFactory.unitType.Wizard;
import creational.abstractFactory.unitType.elf.ElfHunter;
import creational.abstractFactory.unitType.elf.ElfWarrior;
import creational.abstractFactory.unitType.elf.ElfWizard;

public class ElfUnitFactory implements UnitFactory {
    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Hunter createHunter() {
        return new ElfHunter();
    }

    @Override
    public Wizard createWizard() {
        return new ElfWizard();
    }
}
