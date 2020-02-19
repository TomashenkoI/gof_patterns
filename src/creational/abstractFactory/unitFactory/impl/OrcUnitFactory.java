package creational.abstractFactory.unitFactory.impl;

import creational.abstractFactory.unitFactory.UnitFactory;
import creational.abstractFactory.unitType.Hunter;
import creational.abstractFactory.unitType.Warrior;
import creational.abstractFactory.unitType.Wizard;
import creational.abstractFactory.unitType.orc.OrcHunter;
import creational.abstractFactory.unitType.orc.OrcWarrior;
import creational.abstractFactory.unitType.orc.OrcWizard;

public class OrcUnitFactory implements UnitFactory {
    @Override
    public Warrior createWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Hunter createHunter() {
        return new OrcHunter();
    }

    @Override
    public Wizard createWizard() {
        return new OrcWizard();
    }
}
