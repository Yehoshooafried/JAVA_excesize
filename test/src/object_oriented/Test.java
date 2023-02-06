package object_oriented;

public class Test {

	
	
	//atributes
	 private double length;
	private double width;
	
	//constructor
	
		public Test(double length, double width) {
			this.length = length;
			this.width = width;
		}
	
	//methods
	
	public double getParimeter() {
		return length * width;
	}
	
	public double getArea() {
		return (length * 2) + (width *2);
	}
	
	
	
	
	
	
	public static void main(String[]args) {
		
	Test t1 = new Test(5, 7);
	
	}
	
}
