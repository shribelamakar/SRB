public class Boolean
	
	{
	public static void main(String[] metals)
		{
		arrayOfBoolean();
		}
	
	public static void arrayOfBoolean()
		{
		 System.out.println("Array of Boolean");
	
		boolean waterIsMetal=false;
		boolean stoneIsSolid=true;
		boolean airIsSolid=false;

		boolean[] metals={ waterIsMetal,stoneIsSolid,airIsSolid};

		int sizeOfArray=metals.length;
		System.out.println("Total elements "+sizeOfArray);
		 
		boolean elementAtIndex1=metals[1];
		System.out.println("Is element at index one true or false :: "+elementAtIndex1);

		boolean elementAtIndex2=metals[2];
		System.out.println("Is element at index two true or false :: "+elementAtIndex2);
		}
	}