package Main;

public class Player {

	private String name;
	private int goals;
	private int age;
	private String club;
	private String country;
	public Player(String name, int goals, int age, String club, String country) {
		super();
		this.name = name;
		this.goals = goals;
		this.age = age;
		this.club = club;
		this.country = country;
	}
	
	

	@Override
	public String toString() {
		return "Player [name=" + name + ", goals=" + goals + ", age=" + age + ", club=" + club + ", country=" + country
				+ "]";
	}

	public int getGoals() {
		// TODO Auto-generated method stub
		return goals;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setGoals(int goals) {
		this.goals = goals;
	}



	

	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age=age;
		
	}



	public void setClub(String club) {
	
		this.club=club;
		
	}



	public void setCountry(String country) {
		// TODO Auto-generated method stub
		this.country=country;
		
	}






	


	
		
		
	

	
	
	

}
