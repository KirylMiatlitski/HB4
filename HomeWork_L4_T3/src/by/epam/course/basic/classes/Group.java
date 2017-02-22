package by.epam.course.basic.classes;

public class Group {
	private final int n = 10;
	private Student[] group = new Student[n];

	public Student getStudentById( int i) {
		return group[i];
	}

	public void setStudentByID(Student student, int i) {
		this.group[i] = student;
	}
	
	public int getN(){
		return this.n;
	}
	public void findGroupMediana(){
		double mediana = 0;
		int countStudents = 0;
		for (int i = 0; i < 10; i ++){
			Student student;
			student = this.getStudentById(i);
			if (student != null){
				countStudents++;
				mediana += student.getMediana();
			} else {
				break;
			}
		}
		if (countStudents > 0) {
			mediana = mediana / countStudents;
		} else {
			System.out.println("В группе нет студентов");
		}
		
		System.out.println("Средний балл группы равен: " + mediana);
		
		
	}
	
	
}
