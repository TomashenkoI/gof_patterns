package creational.abstractFactory.unitFactory;

import creational.abstractFactory.unitType.Hunter;
import creational.abstractFactory.unitType.Warrior;
import creational.abstractFactory.unitType.Wizard;

public interface UnitFactory {
    Warrior createWarrior();
    Hunter createHunter();
    Wizard createWizard();
}
