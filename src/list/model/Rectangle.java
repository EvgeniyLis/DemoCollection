package list.model;

public class Rectangle {
	private int a;
	private int b;
	public Rectangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getPerim() {
		return 2*(a+b);
	}
	public int getSquare() {
		return a*b;
	}
	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", getPerim()=" + getPerim() + ", getSquare()=" + getSquare() + "]";
	}
	
}
