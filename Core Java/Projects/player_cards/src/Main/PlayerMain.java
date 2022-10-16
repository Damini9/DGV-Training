
package Main;
import java.util.Arrays;
import java.util.Scanner;



public class PlayerMain {
public static void main(String args[])
{
	Scanner scanner = new Scanner(System.in);
	int choice;
	PlayerController p= new PlayerController();
	
	do
	{
		System.out.println("Enter your choice");
		System.out.println("1.Add Player");
		System.out.println("2.View Players");
		System.out.println("3.Delete Player");
		System.out.println("4.Sort Players");
		System.out.println("5.Update PLayers");
		System.out.println("0.Exit");
		
		choice = scanner.nextInt();
		switch(choice)
		{
		case 1:
		{
			p.addPlayer();
			break;
		}
		case 2:
		{
			p.viewPlayers();
			break;
		}
		case 3:
		{
		p.deletePlayers();
			break;
		}
		case 4:
		{
			p.sortplayers();
			break;
		}
		case 5:
		{
			p.updatedPlayer();
			break;
		}
			
		default:
		{
		 System.out.println("You can play the game again");
		
		}
	}
		
}while ( choice != 0);
	
		
}
}

