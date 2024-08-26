import java.util.Scanner;
public class IT24102885Lab6Q1
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Enter a number: ");
		 double number = input.nextInt();
		 System.out.println(" ");
		 
		 double square = number*number;
		 double root = Math.sqrt(number);
		 System.out.println("The square of "+number+" is : "+square);
		 System.out.println("The square root of "+number+" is : "+root);
		
		
		
		
	}
}