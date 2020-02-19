package creational.abstractFactory;

import creational.abstractFactory.unitType.Race;
import creational.abstractFactory.unitFactory.UnitFactory;
import creational.abstractFactory.unitFactory.impl.ElfUnitFactory;
import creational.abstractFactory.unitFactory.impl.OrcUnitFactory;

public abstract class FactoryProvider {

    public static UnitFactory getFactory(Race race) {
        switch (race) {
            case ELF:
                return new ElfUnitFactory();
            case ORC:
                return new OrcUnitFactory();
            default:
                throw new IllegalStateException(race.name() + " factory is not supported");
        }
    }

}
