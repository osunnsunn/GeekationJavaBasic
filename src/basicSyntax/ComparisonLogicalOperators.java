package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		
		//1
		int a = 100 ;
		int b = 10 ;
		boolean isGreater = ( a > b );
		System.out.println( isGreater );
		
		//2
		boolean isSunny = true ;
		boolean isWarm = true ;
		
		boolean result = isSunny && isWarm ;
		System.out.println( result );
		
		//3
		int x = 1 ;
		int y = 10 ;
		
		boolean andResult = ( x > 0 && y % 2 == 0 );
		System.out.println( andResult );
		
		//4
		boolean hasPermission = ! false;
		System.out.println( hasPermission );
	
	}

}
