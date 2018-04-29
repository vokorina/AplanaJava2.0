package task4.part2;

import task4.part2.sweet.Candy;
import task4.part2.sweet.Cookie;

/**
 * Задание 4.2
 *
 * @author Alina Vokorina
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Начинаем компоновать подарок!");
        Gift podarok = new Gift();
        podarok.addSweet(new Candy(45, 333, "Ну очень сладкая!"));
        podarok.addSweet(new Cookie(99, 221, 4));
        podarok.addSweet(new Candy(11, 99, "Кислая!"));
        System.out.println("Общий вес: " + podarok.getTotalWeight() + ", общая стоимость: " + podarok.getTotalPrice());
        System.out.println("Состав подарка: " + podarok.getSostav());
        System.out.println("Завершили собирать подарок.");
    }
}
