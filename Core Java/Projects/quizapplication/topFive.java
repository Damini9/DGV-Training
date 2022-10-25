package quizapplication;
import java.util.Comparator;
public class topFive implements Comparator<Quiz>{
	public int compare(Quiz quiz1,Quiz quiz2)
	{
		return quiz2.getScore()-quiz1.getScore();
	}
}