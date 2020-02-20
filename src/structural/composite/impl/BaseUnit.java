package structural.composite.impl;

import structural.composite.Unit;

public abstract class BaseUnit implements Unit {

    private int posX;
    private int posY;

    public BaseUnit() {
    }

    public BaseUnit(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public void move(long x, long y) {
        System.out.println("unit move");
    }

    @Override
    public long getPosX() {
        return posX;
    }

    @Override
    public long getPosY() {
        return posY;
    }
}
