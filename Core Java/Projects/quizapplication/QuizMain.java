package quizapplication;

import java.util.Scanner;

public class QuizMain {
public static void main(String[] args)
{
	int choice;
	Scanner scanner = new Scanner(System.in);
	QuizControler quizcontroler = new QuizControler();
	quizcontroler.quizArray();
	
	do
	{
		System.out.println("1. Play Game" +" " + "2. See Ranks "+ " " + "0. Exit");
		choice = scanner.nextInt();
		scanner.nextLine();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter your name");
			String name = scanner.nextLine();
			quizcontroler.playGame(name);
			break;
		}
		case 2:
		{
			quizcontroler.seeRankings();
			break;
		}
		default:
		{
			System.out.println("You have goneee");
		}
		}
	
	}
	
	while(choice !=0 );
}
}
