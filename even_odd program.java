import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=a.nextInt();  
		
		if(number%2==0)
		{
			System.out.println("The number is even");
			
		}
			else
			{
				System.out.println("The number is odd");
			}
		
	}

}
