package by.epam.course.basic.main;

import java.util.Random;

import by.epam.course.basic.classes.Group;
import by.epam.course.basic.classes.Student;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 * @task : Оценки, полученные студентами в сессию, являются атрибутами класса Student. Определить:
а) средний балл учебной группы (использовать класс Group);
б) средний балл каждого студента;
в) число отличников;
г) количество студентов, имеющих "2".
 */
public class Main {

	public static void main(String[] args) {
		
		Group group = new Group();
		Random rand = new Random();
		// Создаём группу (10 студентов)
		for (int i = 0; i < group.getN(); i++){
			String stud = "Student" + i;
			Student student = new Student(stud, rand.nextInt(5), rand.nextInt(5), rand.nextInt(5));
			//student.show();
			group.setStudentByID(student, i);			
		}
		// a) Средний балл группы
		System.out.println();
		group.findGroupMediana();
		
		// б) средний балл каждого студента
		System.out.println();
		for (int i=0; i < group.getN(); i++){			
			System.out.println("У студента "+ group.getStudentById(i).getFIO() + " средний балл: " + group.getStudentById(i).getMediana());			
		}
		
		// в) число отличников
		System.out.println();
		int count = 0;
		for (int i=0; i < group.getN(); i++){		
			if (group.getStudentById(i).getПредмет1()+group.getStudentById(i).getПредмет2()+group.getStudentById(i).getПредмет3() == 15) {
				count++;
			}						
		}
		System.out.println("Количество студентов отличников = " + count);

		// г) число отличников
		System.out.println();
		count = 0;
		for (int i=0; i < group.getN(); i++){		
			if ((group.getStudentById(i).getПредмет1() == 2) | 
				(group.getStudentById(i).getПредмет2() == 2) | 
				(group.getStudentById(i).getПредмет3() == 2)) {
				count++;
			}						
		}
		System.out.println("Количество студентов имеющих 2 = " + count);

	}	

}
