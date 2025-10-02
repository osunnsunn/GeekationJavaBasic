package objectPractice;

public class Land extends Property{
	
	private double space;
	
	Land(String property, String name, String type, int money, double space){
		super(property, name, type, money);
		this.space = space;
	}
	
	public void information() {
		Property.printSeparator();
		super.information();
		System.out.println("広さ："+space+"㎡");
		Property.printSeparator();
	}
	
	public double getSpace() {
		return space;
	}

	public void setSpace(double space) {
		this.space = space;
	}
}
