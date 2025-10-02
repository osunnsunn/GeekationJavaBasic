package objectPractice;

public class Apartment extends Property{
	
	private String floor;
	
	
	Apartment(String property, String name, String type, int money,String floor){
		super(property, name, type, money);
		this.floor = floor;
	}
	
	public void information() {
		super.information();
		System.out.println("間取り："+floor);
	}
	
	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}
	
}
