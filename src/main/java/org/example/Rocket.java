package org.example;

public class Rocket extends Weapon{
    public Rocket(String name, int damage, int rateOfFire, int numberOfRounds) {
        super(name, damage, rateOfFire, numberOfRounds);
    }

    @Override
    public String getSoundGunshot() {
        String shot = "Бааааабббааааах!";
        return shot;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", rateOfFire=" + rateOfFire +
                ", numberOfRounds=" + numberOfRounds +
                '}';
    }
}
