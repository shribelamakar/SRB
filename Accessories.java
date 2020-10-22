public class Accessories
	{
	public static void main(String[] accessories)
		{
		System.out.println("JVM invoked main");	
      		String country="Russia";		
	  
		countryName("India");		
		countryName(null);			
		//countryName(); this will not work because no parameters are given
		countryName(country);
		
		System.out.println("main method exit");
		}
	public static void countryName(String name)
		{
		System.out.println("invoked countryName" + name);
		}
	}