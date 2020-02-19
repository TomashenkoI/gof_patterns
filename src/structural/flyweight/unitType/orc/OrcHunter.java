package structural.flyweight.unitType.orc;

import structural.flyweight.unitType.Hunter;
import structural.flyweight.unitType.UnitType;

public class OrcHunter extends UnitType implements Hunter {
    @Override
    public void shot() {
        System.out.println("orc hunter shot");
    }
}
