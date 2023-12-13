package com.company;

public class Lion extends Characters{
    public Lion(String name, double speed, int health, int damage, int armor) {
        super(name, speed, health, damage, armor);
    }
    public Lion(Characters characters) {
        super(characters.getName(), characters.getSpeed(), characters.getHealth(), characters.getDamage(), characters.getArmor());
    }
    @Override
    public Characters clone() {
        return new ShadowFiend(this);
    }
    public String toString() {
        return "Lion{" +
                "name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", health=" + getHealth() +
                ", damage=" + getDamage() +
                ", armor=" + getArmor() +
                '}';
    }
}