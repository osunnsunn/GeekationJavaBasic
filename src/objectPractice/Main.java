package objectPractice;

public class Main {

	public static void main(String[] args) {
		
		Property.printSeparator();
		Apartment apar = new Apartment("いい感じアパートメント","山田 マンション太郎","マンション",50000000,"3LDk");
		apar.information();
		Property.printSeparator();
		
		Property.printSeparator();
		Land land = new Land("いい感じの土地","山田 土地太郎","土地",8000000,105.2);
		land.information();
		Property.printSeparator();

	}

}
