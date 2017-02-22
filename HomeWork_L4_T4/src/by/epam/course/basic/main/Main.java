package by.epam.course.basic.main;

import java.util.Random;

import by.epam.course.basic.classes.Abiturient;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 20 February 2017
 * 
 * @task : ������� ������ ������������ (����� Abiturient) � ������ ������, 
 * ���������� ��� �� ������������� ���������. ���������� ������ �����������, ���� ����� ���� ������ ����� ������������.
 */
public class Main {

	public static void main(String[] args) {
		
		int count; // ���������� ����
		
		Random rand = new Random();
		
		int n = rand.nextInt(15); // ���������� ������������
		count = rand.nextInt(10);
		
		Abiturient[] mas = new Abiturient[n];
		
		System.out.println("���������� " + n + " ������������");
		System.out.println("���������� " + count + " ����");
		System.out.println();
		// �������� ������������
		for (int i = 0; i < n; i++){
			int[] results = {rand.nextInt(5),rand.nextInt(5),rand.nextInt(5)};
			mas[i] = new Abiturient("Srudent"+i, results );
		}
		// ����� ������������
		/*for (int i = 0; i < mas.length; i++){
			mas[i].show();
		}*/
		
		// ��������� ���������
		if ((n > count) & (count > 0)){
			setAbiturients(count, mas);
		} else if(count == 0){
			System.out.println("��� ����");
		} else {
			System.out.println("��� ���������");
		}
		
	}
	
	public static void setAbiturients(int count, Abiturient[] mas){
		int set_abiturients = 	0 ; // ���������� ����������� ������������
		double mediana 		= 	5; // ������������ ������� ����
		double max 			= 	0;
		int max_i 			= 	0;
		boolean[] sayYes 	= 	new boolean[mas.length];
		
		while (set_abiturients < count){
			max = 0;
			max_i = 0;
			for (int i = 0; i < mas.length; i++){
				if ((mas[i].getMediana() > max) & (mas[i].getMediana()<=mediana) & (sayYes[i] == false)) {
					max = mas[i].getMediana();
					max_i = i;
				}
			}
			
			set_abiturients++;
			mediana = max;
			sayYes[max_i]=true;
		
			//System.out.println("������� ���� " + mas[max_i].getMediana());
			
		}
		for (int i = 0; i < mas.length; i++){
			if (sayYes[i] == true){
				System.out.println("�������� ����������: ");
				mas[i].show();
				System.out.println();
			}
		}
		
	}

}
