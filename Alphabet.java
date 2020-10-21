public class Alphabet
	{
	public static void main(String[] alphabet)
		{
		System.out.println("Array of Alphabets ");
		arrayOfAlphabets();
		}

	public static void arrayOfAlphabets()
		{
		char first='A';
		char second='K';
		char third='C';
		char fourth='D';
		char fifth='S';
		char sixth='m';
		char seventh='c';
		char eighth='a';
		char nineth='e';
		char tenth='h';
	     
		char[] alphabet={first,second,third,fourth,fifth,sixth,seventh,eighth,nineth,tenth};
		 int sizeOfArray=alphabet.length;
		 System.out.println("Total elements :"+sizeOfArray);
		 
		char elementAtIndex0=alphabet[0];
		System.out.println("Element at index zero "+elementAtIndex0);
		 
		char elementAtIndex1=alphabet[1];
		System.out.println("Element at index one "+elementAtIndex1);

		char elementAtIndex2=alphabet[2];
		System.out.println("Element at index two "+elementAtIndex2);

		char elementAtIndex3=alphabet[3];
		System.out.println("Element at index three "+elementAtIndex3);

		char elementAtIndex4=alphabet[4];
		System.out.println("Element at index four "+elementAtIndex4);

		char elementAtIndex5=alphabet[5];
		System.out.println("Element at index five "+elementAtIndex5);

		char elementAtIndex6=alphabet[6];
		System.out.println("Element at index six "+elementAtIndex6);

		}
	}