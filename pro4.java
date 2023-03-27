import java.util.Scanner;

class pro4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet :");
		char ch = sc.next().charAt(0);
		
		
		switch(ch)
		{
			case 'a':System.out.println("It is a vowel");break;
			case 'e':System.out.println("It is a vowel");break;
			case 'i':System.out.println("It is a vowel");break;
			case 'o':System.out.println("It is a vowel");break;
			case 'u':System.out.println("It is a vowel");break;
			default:System.out.println("It is not Vowel");
		}
		System.out.println("End of the program");
	}
}