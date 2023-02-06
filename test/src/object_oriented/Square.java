package object_oriented;


import java.util.Scanner;



public class Square {

	private Nekuda uPleft;
	private Nekuda buttomRight;



	// constructor
	public Square(int upX, int upY, int bX, int bY) {
		this.uPleft = new Nekuda(upX, upY);
		this.buttomRight = new Nekuda(bX, bY);
	}

//getters

	public void getQurners() {
		System.out.println(" up x:" + this.uPleft.getX() + " up y:" + this.uPleft.getY() + " buttom x: "
				+ this.buttomRight.getX() + " buttom y: " + this.buttomRight.getY());

	}
	
	public int getWidth() {
		int width = buttomRight.getX() - uPleft.getX()  ;
		return width;
	}
	public int getHeight() {
		int height = buttomRight.getY() - uPleft.getY();
		return height;
	}
	
	public int getArea() {
		
	return (getHeight()* getWidth())/2;
		
		
	}
	public int getScope() {
		
		return 2 * (getHeight()+ getWidth() );
		
	}

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);

		Square a = new Square(0, 0, 3, 4);
//		Square b = new Square(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
	a.getQurners();
	
System.out.println(a.getArea());
System.out.println(a.getScope());


//		b.getQurners();
	}

}
