package objectPractice;

public class Property {

	private String property;
	private String name;
	private String type;
	private int money;
	
	
	Property(String property, String name, String type, int money){
		this.property = property;
		this.name = name;
		this.type = type;
		this.money = money;
	}
	
	public void information() {
		
		System.out.println("物件名：" + property);
		System.out.println("物件所有者名：" + name);
		System.out.println("物件種別：" + type);
		System.out.println("物件価格：" + money + "円");
	}
	
	public static void printSeparator() {
        System.out.println("=============================");
    }
	
	public String getProperty() {
		return property;
	}
	
	public void setProperty() {
		this.property = property;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
