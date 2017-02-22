package by.epam.course.basic.classes;

public class Abiturient {
	private String fullName;
	private int[] resultExam = new int[3];
	
	public Abiturient(String fullName, int[] resultExam) {
		this.fullName = fullName;
		this.resultExam = resultExam;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int[] getResultExam() {
		return resultExam;
	}

	public void setResultExam(int[] resultExam) {
		this.resultExam = resultExam;
	}
	
	public void show(){
		System.out.println("Student name: " + this.getFullName());
		System.out.println("ќценки: ");
		for (int i = 0; i < resultExam.length; i++){
			System.out.print(resultExam[i] + " ");
		}
		System.out.println();
	}
	
	public double getMediana(){
		double mediana = 0;
		for (int i = 0; i < this.resultExam.length; i++){
			mediana += resultExam[i];
		}
		return mediana / resultExam.length;
	}
}
