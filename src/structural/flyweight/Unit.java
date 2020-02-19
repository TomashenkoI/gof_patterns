package structural.flyweight;

import structural.flyweight.unitType.UnitType;

public class Unit {

    private long id;
    private Coordinates coordinates;
    private UnitType unitType;

    public Unit(Coordinates coordinates, UnitType unitType) {
        this.coordinates = coordinates;
        this.unitType = unitType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    private static class Coordinates {
        private int x;
        private int y;

        public Coordinates() {
        }

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
