package by.epam.course.basic.main;

import java.util.Scanner;

import by.epam.course.basic.classes.Customer;
import by.epam.course.basic.classes.Person;
import by.epam.course.basic.classes.Student;

/**
 * @author Kiryl_Miatlitski
 * 
 * @date  19 February 2017
 * 
 * Task : Создать описанные ниже классы. Определить конструктор и методы set(), get(), show(). Определить дополнительно какой – либо метод для каждого класса. Реализовать класс в консольном приложении. Задать критерий выбора данных и вывести эти данные на консоль.
Student : id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс.
Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student("Петров", "Петр", "Петрович", 17, "10.12.1989", "г. Минск", "1030303", "FPSR", 1);
		
		Customer customer = new Customer("Иванов", "Иван", "Иванович", 23, "г. Гродно", "15648254", "21454546458");
		
		System.out.println("Отработка метода show на студенте и клиенте");
		System.out.println(); 
		student.show();
		System.out.println(); 
		customer.show();
		
		System.out.println("Отработка дополнительного метода show на студенте и клиенте");
		System.out.println(); 
		student.getIdAndFullName();
		System.out.println(); 
		customer.getIdAndFullName();
		
		// работа со студентом
		System.out.println(); 
		System.out.println("Какую информацию вы хотите увидеть по Студенту?");
		System.out.println("1. ФИО");
		System.out.println("2. Детали");
		System.out.println("3. Информация о универе?");
		if (sc.hasNextInt()) {
			int input;
			input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println(student.getФамилия() + " " + student.getИмя() + " " + student.getОтчество());
				break;
			case 2:
				System.out.println(" Id "+ student.getId() + ". \n День рождения " + student.getBirthDay()+ ". \n Адрес: " + student.getAdress());
				break;
			case 3:
				System.out.println(" Факультет:  " + student.getФакультет()+ " \n Курс: " + student.getКурс());
				break;

			default:
				System.out.println("Нужно выбрать один из трёх вариантов");
				break;
			}
			
		} else {
			System.out.println("Нужно выбрать один из трёх вариантов");
		}
		
		
		// работа с клиентом
		System.out.println(); 
		System.out.println("Какую информацию вы хотите увидеть по клиенту?");
		System.out.println("1. ФИО");
		System.out.println("2. Детали по cчёту");
		
		if (sc.hasNextInt()) {
			int input;
			input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println(customer.getФамилия() + " " + customer.getИмя() + " " + customer.getОтчество());
				break;
			case 2:
				System.out.println(" Номер кредитной карточки: "+ customer.getНомерКредитнойКарточки()+ ". \n Номер банковского счёта: " + customer.getНомерБанковскогоСчёта());
				break;
			
			default:
				System.out.println("Нужно выбрать один из трёх вариантов");
				break;
			}
			
		} else {
			System.out.println("Нужно выбрать один из трёх вариантов");
		}
		
	}


}
