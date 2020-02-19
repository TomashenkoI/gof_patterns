package structural.composite;

import org.junit.jupiter.api.Test;
import structural.composite.impl.CompoundUnit;
import structural.composite.impl.MeleeUnit;
import structural.composite.impl.RangedUnit;

import java.util.Arrays;

class UnitTest {

    @Test
    void test() {
        Unit meleeUnit = new MeleeUnit(5, 10);
        meleeUnit.move(10, 20);

        Unit rangedUnit = new RangedUnit(5, 10);
        rangedUnit.move(15, 20);

        CompoundUnit compoundUnit = new CompoundUnit(Arrays.asList(meleeUnit, rangedUnit));
        compoundUnit.move(30, 40);
    }

}