package creational.abstractFactory.unitType.orc;

import creational.abstractFactory.unitType.Warrior;

public class OrcWarrior implements Warrior {
    @Override
    public void hit() {
        System.out.println("orc warrior hit");
    }
}
