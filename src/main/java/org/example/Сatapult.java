package org.example;

public class Сatapult extends Weapon {

    public Сatapult(String name, int damage, int rateOfFire, int numberOfRounds) {
        super(name, damage, rateOfFire, numberOfRounds);
    }

    @Override
    public String getSoundGunshot() {
        String shot = "Буффф!";
        return shot;
    }

    @Override
    public String toString() {
        return "Сatapult{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", rateOfFire=" + rateOfFire +
                ", numberOfRounds=" + numberOfRounds +
                '}';
    }
}
