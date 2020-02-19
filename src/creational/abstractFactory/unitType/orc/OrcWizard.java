package creational.abstractFactory.unitType.orc;

import creational.abstractFactory.unitType.Wizard;

public class OrcWizard implements Wizard {
    @Override
    public void cast() {
        System.out.println("orc wizard cast");
    }
}
