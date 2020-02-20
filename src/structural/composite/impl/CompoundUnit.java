package structural.composite.impl;

import structural.composite.Unit;

import java.util.List;

public class CompoundUnit extends BaseUnit {

    private List<Unit> units;

    public CompoundUnit(List<Unit> units) {
        this.units = units;
    }

    public void addUnit(Unit unit) {
        this.units.add(unit);
    }

    @Override
    public void move(long x, long y) {
        for (Unit unit : units) {
            unit.move(x, y);
        }
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }


}
