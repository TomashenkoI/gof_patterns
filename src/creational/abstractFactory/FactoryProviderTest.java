package creational.abstractFactory;

import creational.abstractFactory.unitType.Race;
import creational.abstractFactory.unitFactory.UnitFactory;
import creational.abstractFactory.unitType.Hunter;
import creational.abstractFactory.unitType.Warrior;
import creational.abstractFactory.unitType.Wizard;
import org.junit.jupiter.api.Test;

class FactoryProviderTest {

    @Test
    void test() {
        UnitFactory elfUnitFactory = FactoryProvider.getFactory(Race.ELF);

        Hunter elfHunter = elfUnitFactory.createHunter();
        Warrior elfWarrior = elfUnitFactory.createWarrior();
        Wizard elfWizard = elfUnitFactory.createWizard();

        elfHunter.shot();
        elfWarrior.hit();
        elfWizard.cast();

        System.out.println("---");

        UnitFactory orcUnitFactory = FactoryProvider.getFactory(Race.ORC);

        Hunter orcHunter = orcUnitFactory.createHunter();
        Warrior orcWarrior = orcUnitFactory.createWarrior();
        Wizard orcWizard = orcUnitFactory.createWizard();

        orcHunter.shot();
        orcWarrior.hit();
        orcWizard.cast();
    }

}