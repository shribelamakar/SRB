public class Percentage
	{
	public static void main(String[] result)
		{
		System.out.println("invoked main method by JVM");
		arrayOfPercentage();
		System.out.println("exiting main method by JVM");
		}
	public static void arrayOfPercentage()
		{
		 System.out.println("invoked arrayOfPercentage");
		 float sslcPercentage=78.24f;
	     	 float puPercentage=68.33f;
		 float bePercentage=71.50f;
		
		float[] percentage={sslcPercentage,puPercentage,bePercentage};
		 
		int sizeOfArray=percentage.length;
		System.out.println("Total elements "+sizeOfArray);
		
		float elementAtIndex0=percentage[0];
		System.out.println("Element at index zero "+elementAtIndex0);
	
		float elementAtIndex1=percentage[1];
		System.out.println("Element at index one "+elementAtIndex1);
		 
		float elementAtIndex2=percentage[2];
		System.out.println("Element at index two "+elementAtIndex2);
	
		}
	
	
	
	}