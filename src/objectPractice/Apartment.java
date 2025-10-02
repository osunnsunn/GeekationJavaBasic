package objectPractice;

public class Apartment extends Property {

	private String floor;

	Apartment(String property, String name, String type, int money, String floor) {
		super(property, name, type, money);
		this.floor = floor;
	}

	public void information() {
		Property.printSeparator();
		super.information();
		System.out.println("間取り：" + floor);
		Property.printSeparator();
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

}
