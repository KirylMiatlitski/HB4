package by.epam.course.basic.main;

import java.util.Random;

import by.epam.course.basic.classes.Fraction;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 * @task : Определить класс «Дробь» в виде пары m/n. Объявить массив из k дробей, ввести/вывести значения для массива дробей.
 */
public class Main {

	public static void main(String[] args) {
		
		int k = 		6; // длинна массива дробей
		Random rand = new Random();
		Fraction[] mas = new Fraction[k];
		
		// Вводим массив дробей
		System.out.println("Программа сама генерирует массив дробей");
		for (int i = 0; i < k; i++){
			mas[i] = new Fraction(rand.nextInt(20), rand.nextInt(50));
			mas[i].show();
		}
		System.out.println();
		System.out.println();
		// Выводим значения массива дробей
		System.out.println("Выводим значения массива дробей");
		for (int i=0; i < k; i++) {
			mas[i].showLn();
		}
		
		
	}

}
