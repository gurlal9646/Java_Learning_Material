
public class Lab1 {

	public static void main(String[] args) {
		
		//Declare variables
		String courseCode, name;
		int maxScore;
		double obtainedScore,percentScore;
		 
		//Getting date
		courseCode = "ITC5102";
		name = "Gurlal Singh";
		maxScore = 10;
		obtainedScore = 8;
		
		//Calculating percentage
		percentScore = (obtainedScore / maxScore) * 100;
		
		//Displaying results
		System.out.println("Student Name: " + name);
		System.out.println("Course Code: " + courseCode);
		System.out.println("Your score in this course is " + obtainedScore +" Out of "+ maxScore +", Which is " + percentScore + "%");
		
		System.exit(0);
     
	}

}
