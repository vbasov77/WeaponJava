//Создайте базовый класс Оружие. У оружия есть название, повреждение, скорострельность, количество зарядов в обойме, звук при выстреле — это методы. Напишите метод, который делает один выстрел.
//        Напишите три класса-наследника Оружия. В них переопределите родительские методы.
//        Проверьте, как работают все виды оружия.
//        Создайте тестовый стенд для оружия — метод, который испытывает одно оружие. У мишени 100 единиц здоровья. Оружие стреляет в него, пока не убьёт.
//        Протестируйте все виды оружия на стенде.


package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Weapon> weapons = new ArrayList();
        weapons.add(new Gun("Пистолет-автомат", 4, 5, 50));
        weapons.add(new Сatapult("Катапульта", 15, 1, 9));
        weapons.add(new Rocket("Ракета", 35, 1, 4));


        for (int i = 0; i < weapons.size(); i++) {
            int life = 100;
            int numberOrRounds = weapons.get(i).getNumberOfRounds();
            while (true) {
                if (life > 0 && numberOrRounds > 0) {
                    life = life - weapons.get(i).getDamage();
                    numberOrRounds = numberOrRounds - weapons.get(i).getRateOfFire();
                    System.out.printf("Стреляет %s. %s Урон мишени: %s; Выстрелов: %s; Остаток в обойме: %s\n",
                            weapons.get(i).getName(),
                            weapons.get(i).getSoundGunshot(),
                            life,
                            weapons.get(i).getRateOfFire(),
                            numberOrRounds);

                } else {
                    if (life > 0) {
                        System.out.printf("Мишень выстояла, остаток жизни мишени %s \n", life);
                    } else {
                        System.out.printf("Мишень уничтожена, остаток обоймы орудия - %s - %s\n", weapons.get(i).getName(), numberOrRounds);
                    }
                    break;
                }

            }
        }
    }
}