package creational.abstractFactory.unitType.orc;

import creational.abstractFactory.unitType.Hunter;

public class OrcHunter implements Hunter {
    @Override
    public void shot() {
        System.out.println("orc hunter shot");
    }
}
