package com.company;

public class ShadowFiend extends Characters{
    public ShadowFiend(String name, double speed, int health, int damage, int armor) {
        super(name, speed, health, damage, armor);
    }
    public ShadowFiend(Characters characters) {
        super(characters.getName(), characters.getSpeed(), characters.getHealth(), characters.getDamage(), characters.getArmor());
    }
    @Override
    public Characters clone() {
        return new ShadowFiend(this);
    }
    public String toString() {
        return "ShadowFiend{" +
                "name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", health=" + getHealth() +
                ", damage=" + getDamage() +
                ", armor=" + getArmor() +
                '}';
    }
}