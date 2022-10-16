package Main;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class SortPlayers implements Comparator<Player>
{


	public int compare(Player p1, Player p2) {
		
		return p1.getGoals()- p2.getGoals();
	}
	
}

public class PlayerController {
	Player[] players= new Player[5];
	Scanner scanner = new Scanner (System.in);
	int playerCount=0;
	public void addPlayer()
	{
	   int index=0;
		for(int i=0;i<5;i++)
		{
			if(players[i]==null)
			{
				index=i;
				break;
			}
		}

		System.out.println("Enter names,goals,Age,Club and Country");
		String name= scanner.nextLine();
		int goals=scanner.nextInt();
		int age=scanner.nextInt();
		scanner.nextLine();
		String club=scanner.nextLine();
		String country= scanner.nextLine();
		players[index]=new Player(name,goals,age,club,country);
		playerCount++;
		
	}
	public void viewPlayers()
	{
		for(int i=0;i<5;i++)
		{
			if(players[i]!=null)
			{
				System.out.println(players[i]);
			}
			else
			{
				break;
			}
		}
	}
	public void deletePlayers()
	{
		System.out.println("Enter your choice to delete");
		int choice=scanner.nextInt();
		players[choice]=null;
		for(int i=choice;i<4;i++)
		{
			players[i] = players[i+1];
			
			
		}
		
	}
	public void sortplayers()
	{
		Player[] playersCopy= new Player[playerCount];
		
		 for(int i=0;i<playersCopy.length;i++)
		 {
			 playersCopy[i]=players[i];
		 }
		 Arrays.sort(playersCopy,new SortPlayers());
		 
		 for(Player p :playersCopy)
		 {
			 System.out.println(p);
		 }
	}
	public void updatedPlayer()
	{
		int playerNumber;
		int propertyNumber;
		this.viewPlayerOps();
		
		System.out.println("Choose Player by number");
		playerNumber= scanner.nextInt();
		
		System.out.println("Select a property");
		System.out.println("1. Name");
		System.out.println("2. Goals");
		System.out.println("3. Age");
		
		propertyNumber = scanner.nextInt();
		scanner.nextLine();
		switch(propertyNumber)
		{
		case 1:
		{
			System.out.println("Enter name");
			String name=scanner.nextLine();
			players[playerNumber-1].setName( name);
			break;
		}
		
		case 2:
		{
			System.out.println("Enter goals");
			int goals= scanner.nextInt();
			players[playerNumber-1].setGoals(players[playerNumber-1].getGoals()+goals);
			break;
		}
		case 3:
		{
			System.out.println("Enter age");
			int age=scanner.nextInt();
			scanner.nextLine();
			players[playerNumber-1].setAge(age);
					
			break;
		}
		case 4:
		{
			System.out.println("Enter club");
			String club=scanner.nextLine();
			
			players[playerNumber-1].setClub(club);
					
			break;
		}
		case 5:
		{
			System.out.println("Enter country");
			String country=scanner.nextLine();
			
			players[playerNumber-1].setCountry(country);
					
			break;
		}
		}
	}
	public void viewPlayerOps()
	{
		for(int i=0;i<5;i++)
		{
			if(players[i]!=null)
			{
				System.out.println(players[i+1]);
			}
			else
			{
				break;
			}
		}
	}
	

}
