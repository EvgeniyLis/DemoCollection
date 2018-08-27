package list.model;

public class Triangle {
	private int a;
	private int b;
	private int c;
	
	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
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

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getPerim() {
		if (a<b+c && b<a+c && c<b+a) {
			return a+b+c;
		} else {
			return -1; //если неравенство треуг не выполн, то мы возвращаем отрицат периметр
		}
	}
	public double getSquare() {
		if (a<b+c && b<a+c && c<b+a) {
			return Math.sqrt(getPerim()/2*(getPerim()/2-a)*(getPerim()/2-b)*getPerim()/2-c);
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", getPerim()=" + getPerim() + ", getSquare()="
				+ getSquare() + "]";
	}

	
}
