package object_oriented;

public class SalesMan {

	// atrribute
	String name;
	double[] sales;
	double bonus;
	int salesToCount;

	// constructor
	public SalesMan(String name, int n, double bonus) {
		this.name = name;
		this.sales = new double[n];
		this.bonus = bonus;
	}

	// functions
	private int getMin(double[] arr) {
		
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[index]) {
				index = i;
			}

		}
		return index;
	}

	// addSale
	public void addSale(Double saleAmount) {

		int minIndex = getMin(sales);
		if (saleAmount > sales[minIndex]) {
			sales[minIndex] = saleAmount;
		}

	}

	// calculate
	public Double calculateBonus() {
		double sum = 0;
		for (int i = 0; i < sales.length; i++) {
			sum += sales[i];
		}
		System.out.println(sum * bonus);
		return sum * bonus;
	}

	// getbonus
	public double[] getBonusSales() {

		double[] arrToSend = new double[sales.length];
		for (int i = 0; i < arrToSend.length; i++) {
			arrToSend[i] = sales[i];
		}
		return arrToSend;
	}

	public String getName() {
		
		return this.name;
	}
	
	public static void main(String[] args) {
		SalesMan meni = new SalesMan("meni", 3 ,0.10);
		meni.addSale(20.0);
		meni.addSale(50.0);
		meni.addSale(30.0);
		meni.addSale(10.0);
		meni.calculateBonus();
		
	}

}
