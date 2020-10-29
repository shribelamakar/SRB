public class Place
	{
	public static String finder(int fromDistance)
		{
		System.out.println("finder method invoked");
		System.out.println("fromDistance "+fromDistance);

		if(fromDistance==150)
			{
			System.out.println("Mysore");
			return "Mysore";
			}
		if(fromDistance==200)
			{
			System.out.println("Davangere");
			return "Davangere";
			}
		if(fromDistance==400)
			{
			System.out.println("Hassan");
			return "Hassan";
			}
		if(fromDistance==1500)
			{
			System.out.println("Gujarat");
			return "Gujarat";
			}
		if(fromDistance==1934)
			{
			System.out.println("Agra");
			return "Agra";
			}
		if(fromDistance==750)
			{
			System.out.println("Mumbai");
			return "Mysore";
			}
		if(fromDistance==412)
			{
			System.out.println("Gadag");
			return "Gadag";
			}
		if(fromDistance>=100000)
			{
			System.out.println("place Not in earth");
			return "place Not in earth";
			}
		return "place not found";
		}
	}
