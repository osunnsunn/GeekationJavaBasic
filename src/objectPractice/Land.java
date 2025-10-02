package objectPractice;

public class Land extends Property{
	
	private double space;
	
	
	Land(String property, String name, String type, int money,double space){
		super(property, name, type, money);
		this.space = space;
	}
	
	public void information() {
		super.information();
		System.out.println("広さ："+space+"㎡");
		
	}
	
	public double getSpace() {
		return space;
	}

	public void setSpace(double space) {
		this.space = space;
	}

}
