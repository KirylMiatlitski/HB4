package by.epam.course.basic.main;

import java.util.Random;

import by.epam.course.basic.classes.Group;
import by.epam.course.basic.classes.Student;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 * @task : ������, ���������� ���������� � ������, �������� ���������� ������ Student. ����������:
�) ������� ���� ������� ������ (������������ ����� Group);
�) ������� ���� ������� ��������;
�) ����� ����������;
�) ���������� ���������, ������� "2".
 */
public class Main {

	public static void main(String[] args) {
		
		Group group = new Group();
		Random rand = new Random();
		// ������ ������ (10 ���������)
		for (int i = 0; i < group.getN(); i++){
			String stud = "Student" + i;
			Student student = new Student(stud, rand.nextInt(5), rand.nextInt(5), rand.nextInt(5));
			//student.show();
			group.setStudentByID(student, i);			
		}
		// a) ������� ���� ������
		System.out.println();
		group.findGroupMediana();
		
		// �) ������� ���� ������� ��������
		System.out.println();
		for (int i=0; i < group.getN(); i++){			
			System.out.println("� �������� "+ group.getStudentById(i).getFIO() + " ������� ����: " + group.getStudentById(i).getMediana());			
		}
		
		// �) ����� ����������
		System.out.println();
		int count = 0;
		for (int i=0; i < group.getN(); i++){		
			if (group.getStudentById(i).get�������1()+group.getStudentById(i).get�������2()+group.getStudentById(i).get�������3() == 15) {
				count++;
			}						
		}
		System.out.println("���������� ��������� ���������� = " + count);

		// �) ����� ����������
		System.out.println();
		count = 0;
		for (int i=0; i < group.getN(); i++){		
			if ((group.getStudentById(i).get�������1() == 2) | 
				(group.getStudentById(i).get�������2() == 2) | 
				(group.getStudentById(i).get�������3() == 2)) {
				count++;
			}						
		}
		System.out.println("���������� ��������� ������� 2 = " + count);

	}	

}
