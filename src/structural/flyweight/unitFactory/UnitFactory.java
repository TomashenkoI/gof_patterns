package structural.flyweight.unitFactory;

import structural.flyweight.unitType.UnitType;

import java.util.HashMap;
import java.util.Map;

public abstract class UnitFactory {

    private static final Map<Class<? extends UnitType>, UnitType> UNIT_TYPE_MAP = new HashMap<>();

    public static UnitType getUnitType(Class<? extends UnitType> key) throws Exception {
        if (UNIT_TYPE_MAP.containsKey(key)) {
            return UNIT_TYPE_MAP.get(key);
        } else {
            UnitType unitType = key.newInstance();
            UNIT_TYPE_MAP.put(key, unitType);
            return unitType;
        }
    }
}
