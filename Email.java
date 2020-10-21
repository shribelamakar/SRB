public class Email 
{
	public static void main ( String[] email)
	{
		
		arrayOfEmail();
	}
	public static void arrayOfEmail()
	{
		System.out.println("invoking arrayOfEmail");

		String contactEmail="shri@gmail.com";
		String xworkzEmail="xworkz@gmail.com";
		String recoveryEmail="recover@gmail.com";	
		
		String[] emails={contactEmail,xworkzEmail,recoveryEmail};
		int sizeOfArray=emails.length;
		System.out.println("Total elements "+sizeOfArray);
		
		String elementAtIndex1=emails[1];
		System.out.println("Element at index one "+elementAtIndex1);
	}
}