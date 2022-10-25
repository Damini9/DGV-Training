package quizapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizControler {
 Scanner scanner = new Scanner(System.in);
 
 
 ArrayList<Quiz> quizData = new ArrayList<>();
 int choice;
 int count;
  public void quizArray() {
	  quizData.add(new Quiz("Sanya",21));
	  quizData.add(new Quiz("Chelsea",11));
	  quizData.add(new Quiz("Ria",25));
	  quizData.add(new Quiz("Sanya",31));
	  quizData.add(new Quiz("Damini",21));
  }
  public void playGame(String Name)
  {
	  count =0;
	  
	  
	  System.out.println("Do yo know me?");
	  System.out.println("1 yes 2 no");
	  choice = scanner.nextInt();
	  
	  switch(choice)
	  {
	  case 1:
	  {
		  count +=10;
		  System.out.println("Score "+count);
		  break;
	  }
	  case 2:
	  {
		  count -=5;
		  System.out.println("Score "+ count);
		  break;
	  }
	  
	  }
	  System.out.println("Is Chlsea a dancer?");
	  System.out.println("1 yes 2 no");
	  choice = scanner.nextInt();
	  switch(choice)
	  {
	  case 1:
	  {
		  count +=10;
		  System.out.println("Score "+count);
		  break;
	  }
	  case 2:
	  {
		  count -=5;
		  System.out.println("Score "+ count);
		  break;
	  }
	  
	  }
	  System.out.println("Does Ria live in Delhi");
	  System.out.println("1 yes 2 no");
	  choice = scanner.nextInt();
	  switch(choice)
	  {
	  case 1:
	  {
		  count +=10;
		  System.out.println("Score "+count);
		  break;
	  }
	  case 2:
	  {
		  count -=5;
		  System.out.println("Score "+ count);
		  break;
	  }
	  
	  }
	  System.out.println("Does Ria study?");
	  System.out.println("1 yes 2 no");
	  choice = scanner.nextInt();
	  switch(choice)
	  {
	  case 1:
	  {
		  count +=10;
		  System.out.println("Score "+count);
		  break;
	  }
	  case 2:
	  {
		  count -=5;
		  System.out.println("Score "+ count);
		  break;
	  }
	  
	  }
	  System.out.println("Is Damini here?");
	  System.out.println("1 yes 2 no");
	  choice = scanner.nextInt();
	  switch(choice)
	  {
	  case 1:
	  {
		  count +=10;
		  System.out.println("Score "+count);
		  break;
	  }
	  case 2:
	  {
		  count -=5;
		  System.out.println("Score "+ count);
		  break;
	  }
	  
	  }
	  System.out.println("Does Damini love Nangal?");
	  System.out.println("1 yes 2 no");
	  choice = scanner.nextInt();
	  switch(choice)
	  {
	  case 1:
	  {
		  count +=10;
		  System.out.println("Score "+count);
		  break;
	  }
	  case 2:
	  {
		  count -=5;
		  System.out.println("Score "+ count);
		  break;
	  }
	  
	  }
	  System.out.println("Does Damini live in Chandigarh?");
	  System.out.println("1 yes 2 no");
	  choice = scanner.nextInt();
	  switch(choice)
	  {
	  case 1:
	  {
		  count +=10;
		  System.out.println("Score "+count);
		  break;
	  }
	  case 2:
	  {
		  count -=5;
		  System.out.println("Score "+ count);
		  break;
	  }
	  
	  }
	  System.out.println("Is Chlsea married?");
	  System.out.println("1 yes 2 no");
	  choice = scanner.nextInt();
	  switch(choice)
	  {
	  case 1:
	  {
		  count +=10;
		  System.out.println("Score "+count);
		  break;
	  }
	  case 2:
	  {
		  count -=5;
		  System.out.println("Score "+ count);
		  break;
	  }
	  
	  }
	  quizData.add(new Quiz(Name,count));
	  
	  
  }
  public void seeRankings()
  {
	 Collections.sort(quizData,new topFive());
  }
 
}
