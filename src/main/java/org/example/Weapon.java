package org.example;

public abstract class Weapon {

    protected String name; // Название

    protected int damage; // Повреждение
    protected int rateOfFire; // Cкорострельность
    protected int numberOfRounds; // Количество зарядов в обойме

    public Weapon(String name,  int damage, int rateOfFire, int numberOfRounds) {
        this.name = name;
        this.damage = damage;
        this.rateOfFire = rateOfFire;
        this.numberOfRounds = numberOfRounds;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getRateOfFire() {
        return rateOfFire;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public abstract String getSoundGunshot();

}
