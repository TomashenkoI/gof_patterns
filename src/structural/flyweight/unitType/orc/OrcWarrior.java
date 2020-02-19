package structural.flyweight.unitType.orc;

import structural.flyweight.unitType.UnitType;
import structural.flyweight.unitType.Warrior;

public class OrcWarrior extends UnitType implements Warrior {
    @Override
    public void hit() {
        System.out.println("orc warrior hit");
    }
}
