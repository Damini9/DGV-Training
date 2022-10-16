import java.util.Scanner;
class Player2
{
String name;
int score;
String team;
public String getName()
{
return name;
}
public void setName(String n)
{
name=n;
}

public int getScore()
{
return score;
}
public void setScore(int s)
{
score=s;
}

public String getTeam()
{
return team;
}
public void setTeam(String t)
{
team=t;
}
}


class Player
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Player2 p =new Player2();
System.out.println("Enter name");
String name=sc.nextLine();
p.setName(name);
System.out.println("Enter score");
int score=sc.nextInt();
p.setScore(score);
sc.nextLine();
System.out.println("Enter team");
String t=sc.nextLine();
p.setTeam(t);
System.out.println(p.getName());
System.out.println(p.getScore());

System.out.println(p.getTeam());
}
}
