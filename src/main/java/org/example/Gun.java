package org.example;

public class Gun extends Weapon{

    public Gun(String name,  int damage, int rateOfFire, int numberOfRounds) {
        super(name,  damage, rateOfFire, numberOfRounds);
    }

    @Override
    public String getSoundGunshot() {
        String shot = "Тра та та та!";
        return shot;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", rateOfFire=" + rateOfFire +
                ", numberOfRounds=" + numberOfRounds +
                '}';
    }
}
