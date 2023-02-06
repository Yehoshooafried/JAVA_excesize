package object_oriented;

import java.util.Scanner;

public class Shopes {

	// atrributes
	private String shopName;

	private int salesBonus;
	private double bonus;
	private SalesMan[] employArr;

// constructor

	public Shopes(String shopName, int initSellers, int salesBonus, double bonus) {
		this.shopName = shopName;
		this.salesBonus = salesBonus;
		this.bonus = bonus;
		this.employArr = new SalesMan[initSellers];
	}

	// functions
	public void initSellers() {
		Scanner in = new Scanner(System.in);
		String name;
		for (int i = 0; i < employArr.length; i++) {
			name = in.next();
			employArr[i] = new SalesMan(name, salesBonus, bonus);
		}
	}

	// fire
public void fire(String name) {
	
	int length = employArr.length;
	SalesMan [] temp = new SalesMan[length];
	
}
	
	// addEmploye
}
