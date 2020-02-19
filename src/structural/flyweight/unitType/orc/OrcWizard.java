package structural.flyweight.unitType.orc;

import structural.flyweight.unitType.UnitType;
import structural.flyweight.unitType.Wizard;

public class OrcWizard extends UnitType implements Wizard {
    @Override
    public void cast() {
        System.out.println("orc wizard cast");
    }
}
