import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		
		//Declaring name and course code literals
		String name ="Gurlal Singh",courseName = "Java Programming";
		System.out.println("Developed and Created by: "+ name);
		
		//Declaring constants
		final int TOTALMARKSFORASSIGNMENTS = 40,TOTALMARKSFORLABS = 30,
			      TOTALMARKSFORMIDFINAL = 200;
		
		//Declaring variables
		double assignmentPercentage,labPercentage,midFinalPercentage,overallPercentage;
				
		
		//Creating object of scanner class
		Scanner kbd = new Scanner(System.in);
		
		//Getting the name of the user from user
		System.out.println("Enter the name of the student");
		String studentName = kbd.nextLine();
		
		//Getting the score for assignments
		System.out.println("Enter the Score of Assignment 1");
		double assignment1Marks = kbd.nextDouble();
		
		System.out.println("Enter the Score of Assignment 2");
		double assignment2Marks = kbd.nextDouble();
		
		//Calculating percentage of Assignments
		assignmentPercentage = ((assignment1Marks + assignment2Marks) / TOTALMARKSFORASSIGNMENTS )* 100;
		 
		//Getting the score for labs
		System.out.println("Enter the Score of Lab 1");
		double lab1Marks = kbd.nextDouble();
			
		System.out.println("Enter the Score of Lab 2");
		double lab2Marks = kbd.nextDouble();
		
		System.out.println("Enter the Score of Lab 3");
		double lab3Marks = kbd.nextDouble();
			
		//Calculating percentage of Labs
		labPercentage = ((lab1Marks + lab2Marks +lab3Marks) / TOTALMARKSFORLABS )* 100;
		
		//Getting the score for Mid and final term exams
		System.out.println("Enter the Score of MidTerm exam");
		double midtermMarks = kbd.nextDouble();
				
		System.out.println("Enter the Score of Final exam");
		double finalExamMarks = kbd.nextDouble();
				
		//Calculating percentage of mid and final exams
		midFinalPercentage = ((midtermMarks + finalExamMarks) / TOTALMARKSFORMIDFINAL )* 100;
		
		//Calculating overall percentage
		
		overallPercentage = (((assignment1Marks + assignment2Marks) +(lab1Marks + lab2Marks +lab3Marks) + (midtermMarks + finalExamMarks)) / (TOTALMARKSFORASSIGNMENTS + TOTALMARKSFORLABS + TOTALMARKSFORMIDFINAL) * 100);
		
		//Displaying the output
		System.out.printf("Student Name: %s \n",studentName);
		System.out.printf("Course Name: %s \n",courseName);
		System.out.printf("Assignment 1 Score: %.2f \n",assignment1Marks);
		System.out.printf("Assignment 2 Score: %.2f \n",assignment2Marks);
		System.out.printf("Total Assignment score: %.2f \n",assignment1Marks + assignment2Marks);
		System.out.printf("Assignment Percentage: %.2f %%\n",assignmentPercentage);
		System.out.printf("Lab 1 Score: %.2f \n",lab1Marks);
		System.out.printf("Lab 2 Score: %.2f \n",lab2Marks);
		System.out.printf("Lab 3 Score: %.2f \n",lab3Marks);
		System.out.printf("Total Lab Score: %.2f \n",lab1Marks + lab2Marks + lab3Marks);
		System.out.printf("Lab Percentage: %.2f %%\n",labPercentage);
		System.out.printf("MidTerm exam Score: %.2f \n",midtermMarks);
		System.out.printf("Final exam Score: %.2f \n",finalExamMarks);
		System.out.printf("Total Final and midterm exam Score: %.2f \n",midtermMarks + finalExamMarks);
		System.out.printf("Final and midterm Percentage: %.2f %%\n",midFinalPercentage);
		System.out.printf("Overall percentage : %.2f %%\n",overallPercentage);
		
        System.exit(0);
	}

}
