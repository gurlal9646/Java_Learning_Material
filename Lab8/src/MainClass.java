import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		  System.out.printf("Designed and Developed by Gurlal Singh \n");
		
		//Creating and array of object for ReportCard clas		
		ReportCard arrReport[] = new ReportCard[2];
			
		for(int i=0;i<arrReport.length;i++) 
		{
			
			  //An object of scanner class
			  Scanner kbd = new Scanner(System.in);
			
			  //Initialization of object in an array
			   arrReport[i] = new ReportCard();
			   
			   //Taking user inputs
			   System.out.printf("Enter the name of the student %d :\n",i+1);				
			   arrReport[i].setStudentName(kbd.nextLine());
			   
			   boolean isValidScore = false;
			   if(!arrReport[i].getStudentName().isEmpty())
			   {

			     do 
			     {
				  
				   System.out.printf("Enter the Assignment one score for %s : \n",arrReport[i].getStudentName());	
				   isValidScore = arrReport[i].setAssignmentOneScore(kbd.nextDouble());
				   if(!isValidScore) 
				   {
					   System.out.printf("Enter the score for Assignment one between %.2f and %.2f \n",AppConstants.MIN_MIDTERM_ASSIGMENT_SCORE, AppConstants.MAX_ASSIGNMENT_SCORE);	
				   }
			     }
			     while(!isValidScore);
			   		     
			     do 
			     {
				  
				   System.out.printf("Enter the  Assignment two score for %s : \n",arrReport[i].getStudentName());	
				   isValidScore = arrReport[i].setAssignmentTwoScore(kbd.nextDouble());
				   if(!isValidScore) 
				   {
					   System.out.printf("Enter the score for Assignment two between %.2f and %.2f \n",AppConstants.MIN_MIDTERM_ASSIGMENT_SCORE, AppConstants.MAX_ASSIGNMENT_SCORE);	
				   }
			     }
			     while(!isValidScore);
			     			     
			     do 
			     {
				  
				   System.out.printf("Enter the  Midterm score for %s : \n",arrReport[i].getStudentName());	
				   isValidScore = arrReport[i].setMidTermScore(kbd.nextDouble());
				   if(!isValidScore) 
				   {
					   System.out.printf("Enter the score for Midterm between %.2f and %.2f \n",AppConstants.MIN_MIDTERM_ASSIGMENT_SCORE, AppConstants.MAX_MIDTERM_SCORE);	
				   }
			     }
			      while(!isValidScore);
			     	     
			     do 
			     {
				  
				   System.out.printf("Enter the FinalTerm score for %s \n",arrReport[i].getStudentName());	
				   isValidScore = arrReport[i].setFinalTermScore(kbd.nextDouble());
				   if(!isValidScore) 
				   {
					   System.out.printf("Enter the score for FinalTerm between %.2f and %.2f \n",AppConstants.MIN_MIDTERM_ASSIGMENT_SCORE, AppConstants.MAX_MIDTERM_SCORE);	
				   }
			     }
			      while(!isValidScore);
			  }		   		   
		}
				
		printStudents(arrReport);
	}
	
	public static void printStudents(ReportCard arrReport[]) {
		
		// Declaring variables to store minimum, maximum and average score for each category
		double totalAssignmentScore = 0, totalTestScore = 0, minAssignmentScore = 0, maxAssignmentScore = 0,
				minTestScore= 0, maxTestScore = 0;
		for(int i=0;i<arrReport.length;i++)
		{			
		   System.out.printf("StudentName is : %s \n", arrReport[i].getStudentName());
		   System.out.printf("Assignment one Score is %.2f  out of %.2f \n", arrReport[i].getAssignmentOneScore(),AppConstants.MAX_ASSIGNMENT_SCORE);
		   System.out.printf("Assignment two Score is %.2f out of %.2f  \n", arrReport[i].getAssignmentTwoScore(),AppConstants.MAX_ASSIGNMENT_SCORE);
		   System.out.printf("Midterm Score is %.2f  out of %.2f \n", arrReport[i].getMidTermScore(),AppConstants.MAX_MIDTERM_SCORE);
		   System.out.printf("Finalterm Score is %.2f  out of %.2f\n", arrReport[i].getFinalTermScore(),AppConstants.MAX_MIDTERM_SCORE);
		   System.out.printf("Assigment Total score is %.2f  out of %.2f \n", arrReport[i].getAssignmentTotal(),AppConstants.TOTAL_ASSIGNMENT_SCORE);
		   System.out.printf("Total test score is %.2f  out of %.2f \n", arrReport[i].getTestTotal(), AppConstants.TOTAL_TEST_SCORE );
		   System.out.printf("Overall score is %.2f  out of %.2f \n", arrReport[i].getOverallScore(), AppConstants.MAX_OVERALL_SCORE );
		   System.out.printf("Overall score percentage is %.2f %% \n", (arrReport[i].getOverallScore() / AppConstants.MAX_OVERALL_SCORE ) * AppConstants.MAX_OVERALL_SCORE );
		   System.out.printf("--------------------------------------------- \n");
		   
		   totalAssignmentScore +=  arrReport[i].getAssignmentTotal();
		   totalTestScore +=  arrReport[i].getTestTotal();
		   if(i==0) {
			   minAssignmentScore = arrReport[i].getAssignmentTotal();  
			   maxAssignmentScore = arrReport[i].getAssignmentTotal();
			   minTestScore =  arrReport[i].getTestTotal();
			   maxTestScore =  arrReport[i].getTestTotal();
			   
		   }
		   
		   if(arrReport[i].getAssignmentTotal() < minAssignmentScore) {
			   minAssignmentScore = arrReport[i].getAssignmentTotal(); 
		   }
		   if(arrReport[i].getAssignmentTotal() > maxAssignmentScore) {
			   maxAssignmentScore = arrReport[i].getAssignmentTotal(); 
		   }
		   
		   if(arrReport[i].getTestTotal() < minTestScore) {
			   minTestScore = arrReport[i].getTestTotal(); 
		   }
		   
		   if(arrReport[i].getTestTotal() > maxTestScore) {
			   maxTestScore = arrReport[i].getTestTotal(); 
		   }
		   
		}
		
		   System.out.printf("Average Score for assigments is %.2f  \n", (totalAssignmentScore / arrReport.length));
		   System.out.printf("Lowest Score for assignment is %.2f  \n", minAssignmentScore);
		   System.out.printf("Highest Score for assignment is %.2f  \n", maxAssignmentScore);
		   System.out.printf("Average Score for tests is %.2f  \n", (totalTestScore / arrReport.length));
		   System.out.printf("Lowest Score for test is %.2f  \n", minTestScore);
		   System.out.printf("Highest Score for test is %.2f  \n", maxTestScore);
		
	}
	
	public static double getAssignmentAverageScore(ReportCard arrReport[]) 
	{
	    double sum = 0;
		for(int i=0;i<arrReport.length;i++) {	
			sum +=  arrReport[i].getAssignmentTotal();
		}	
		return (sum /arrReport.length);				
	}
	
	public static double getTestAverageScore(ReportCard arrReport[]) 
	{
	    double sum = 0;
		for(int i=0;i<arrReport.length;i++) {	
			sum +=  arrReport[i].getTestTotal();
		}	
		return (sum /arrReport.length);				
	}
	

}
