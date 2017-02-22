package by.epam.course.basic.main;

import java.util.Random;

import by.epam.course.basic.classes.Fraction;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 * @task : ���������� ����� ������� � ���� ���� m/n. �������� ������ �� k ������, ������/������� �������� ��� ������� ������.
 */
public class Main {

	public static void main(String[] args) {
		
		int k = 		6; // ������ ������� ������
		Random rand = new Random();
		Fraction[] mas = new Fraction[k];
		
		// ������ ������ ������
		System.out.println("��������� ���� ���������� ������ ������");
		for (int i = 0; i < k; i++){
			mas[i] = new Fraction(rand.nextInt(20), rand.nextInt(50));
			mas[i].show();
		}
		System.out.println();
		System.out.println();
		// ������� �������� ������� ������
		System.out.println("������� �������� ������� ������");
		for (int i=0; i < k; i++) {
			mas[i].showLn();
		}
		
		
	}

}
