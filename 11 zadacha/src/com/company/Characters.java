package com.company;

public abstract class Characters {
    private String name;
    private double speed;
    private int health;
    private int damage;
    private int armor;

    public Characters(String name, double speed, int health, int damage, int armor) {
        this.name = name;
        this.speed = speed;
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }
    public abstract Characters clone();

    public void setName(String name) {
        this.name = name;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getName() {
        return name;
    }
    public double getSpeed() {
        return speed;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }
}
