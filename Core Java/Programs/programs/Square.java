package programs;
import java.util.Scanner;

public class Square implements Shape {
	int side;
	
	public void getDetails()
	{
		System.out.println("Enter side");
		Scanner sc=new Scanner(System.in);
		 side= sc.nextInt();
		 
	}
	public int area()
	{
		return  side*side;
	}

}
