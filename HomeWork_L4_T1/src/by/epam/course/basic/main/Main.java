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
 * Task : ������� ��������� ���� ������. ���������� ����������� � ������ set(), get(), show(). ���������� ������������� ����� � ���� ����� ��� ������� ������. ����������� ����� � ���������� ����������. ������ �������� ������ ������ � ������� ��� ������ �� �������.
Student : id, �������, ���, ��������, ���� ��������, �����, �������, ���������, ����.
Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student("������", "����", "��������", 17, "10.12.1989", "�. �����", "1030303", "FPSR", 1);
		
		Customer customer = new Customer("������", "����", "��������", 23, "�. ������", "15648254", "21454546458");
		
		System.out.println("��������� ������ show �� �������� � �������");
		System.out.println(); 
		student.show();
		System.out.println(); 
		customer.show();
		
		System.out.println("��������� ��������������� ������ show �� �������� � �������");
		System.out.println(); 
		student.getIdAndFullName();
		System.out.println(); 
		customer.getIdAndFullName();
		
		// ������ �� ���������
		System.out.println(); 
		System.out.println("����� ���������� �� ������ ������� �� ��������?");
		System.out.println("1. ���");
		System.out.println("2. ������");
		System.out.println("3. ���������� � �������?");
		if (sc.hasNextInt()) {
			int input;
			input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println(student.get�������() + " " + student.get���() + " " + student.get��������());
				break;
			case 2:
				System.out.println(" Id "+ student.getId() + ". \n ���� �������� " + student.getBirthDay()+ ". \n �����: " + student.getAdress());
				break;
			case 3:
				System.out.println(" ���������:  " + student.get���������()+ " \n ����: " + student.get����());
				break;

			default:
				System.out.println("����� ������� ���� �� ��� ���������");
				break;
			}
			
		} else {
			System.out.println("����� ������� ���� �� ��� ���������");
		}
		
		
		// ������ � ��������
		System.out.println(); 
		System.out.println("����� ���������� �� ������ ������� �� �������?");
		System.out.println("1. ���");
		System.out.println("2. ������ �� c����");
		
		if (sc.hasNextInt()) {
			int input;
			input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println(customer.get�������() + " " + customer.get���() + " " + customer.get��������());
				break;
			case 2:
				System.out.println(" ����� ��������� ��������: "+ customer.get����������������������()+ ". \n ����� ����������� �����: " + customer.get���������������������());
				break;
			
			default:
				System.out.println("����� ������� ���� �� ��� ���������");
				break;
			}
			
		} else {
			System.out.println("����� ������� ���� �� ��� ���������");
		}
		
	}


}
