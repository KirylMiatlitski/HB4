package by.epam.course.basic.main;

import java.util.Random;

import by.epam.course.basic.classes.Abiturient;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 20 February 2017
 * 
 * @task : »меетс€ список абитуриентов (класс Abiturient) и список оценок, 
 * полученных ими на вступительных экзаменах. Ќапечатать список поступивших, если число мест меньше числа абитуриентов.
 */
public class Main {

	public static void main(String[] args) {
		
		int count; // количество мест
		
		Random rand = new Random();
		
		int n = rand.nextInt(15); // количество абитуриентов
		count = rand.nextInt(10);
		
		Abiturient[] mas = new Abiturient[n];
		
		System.out.println("—уществует " + n + " абитуриентов");
		System.out.println("—уществует " + count + " мест");
		System.out.println();
		// создание абитуриентов
		for (int i = 0; i < n; i++){
			int[] results = {rand.nextInt(5),rand.nextInt(5),rand.nextInt(5)};
			mas[i] = new Abiturient("Srudent"+i, results );
		}
		// вывод абитуриентов
		/*for (int i = 0; i < mas.length; i++){
			mas[i].show();
		}*/
		
		// зачисл€ем студентов
		if ((n > count) & (count > 0)){
			setAbiturients(count, mas);
		} else if(count == 0){
			System.out.println("Ќет мест");
		} else {
			System.out.println("¬се зачислены");
		}
		
	}
	
	public static void setAbiturients(int count, Abiturient[] mas){
		int set_abiturients = 	0 ; // количество зачисленных абитуриентов
		double mediana 		= 	5; // максимальный средний балл
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
		
			//System.out.println("—редний балл " + mas[max_i].getMediana());
			
		}
		for (int i = 0; i < mas.length; i++){
			if (sayYes[i] == true){
				System.out.println("«ачислен абитуриент: ");
				mas[i].show();
				System.out.println();
			}
		}
		
	}

}
