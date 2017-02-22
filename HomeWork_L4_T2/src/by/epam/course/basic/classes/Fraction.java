package by.epam.course.basic.classes;

public class Fraction {
	private int n;
	private int m;
	public Fraction(int n, int m) {
		this.n = n;
		this.m = m;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	
	public void show(){
		System.out.print(n + "/" + m +" ");
	}
	public void showLn(){
		System.out.println(n + "/" + m);
	}
	
}
