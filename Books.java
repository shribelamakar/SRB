public class Books
	{
	public static void main(String[] textbook)
		{
		System.out.println("invoked main");
		writing("ATD");
		writing("FM","DOM");
		writing("ATD",9);
		writing(5,"OR",1.2f,'A');
		}
	public static void writing(String guide)
		{
		System.out.println("invoked writing");
		System.out.println("arg stories:  "+guide);
		}
	public static void writing(String stories,String novels)
		{
		System.out.println("invoked holding with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 stories   "+stories);
		System.out.println("arg2 novels   "+novels);
		}
	public static void writing(String stories,int indexNo)
		{
		
		System.out.println("invoked holding with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 stories  "+stories);
		System.out.println("arg2 indexNo   "+indexNo);
		}
	
	public static void writing(int indexNo,String stories,float percentageOfInk,char grade)
		{
		System.out.println("invoked holding with two parameters ");
		System.out.println("int and String and float and character");
		System.out.println("arg1 indexNo  "+indexNo);
		System.out.println("arg2 stories   "+stories);
		System.out.println("arg3 percentageOfInk  "+percentageOfInk);
		System.out.println("arg4 grade  "+grade);
		}
	}