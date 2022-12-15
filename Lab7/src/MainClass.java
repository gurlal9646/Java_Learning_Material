import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		// Displaying developed by 
	    System.out.printf("Designed and Developed By: Gurlal Singh \n");
	    
	    //Declaring variables
	    String choice;
	    
	    //Declaring constants
	    final String OPTIONYES = "yes";
	
	    //Object of scanner class
	    Scanner kbd = new Scanner(System.in);
		do 
	    {
			Test test = createTest();
			printTest(test);
			 
		   System.out.println("Do you have an other test ?  ");
		   choice = kbd.next();
		   
		   kbd.nextLine();
		   					 
		}
		while(choice.equalsIgnoreCase(OPTIONYES)) ;
		
		System.out.printf("No more test results to display");
		
		System.exit(0);
	}
	
	public static Test createTest() {
		
		//Object of scanner class
		Scanner kbd = new Scanner(System.in);
		 
		//Object of test class
		Test test = new Test(); 
		
		// Varibale to keep track of valid customertype or not
		boolean isValidObtainedMarks, isValidMaxMarks;
		
	  	
	   do 
	   {
			    System.out.printf("Enter the maximum marks for test: \n");
			    isValidMaxMarks = test.setMaxMarks(kbd.nextDouble());
			    if(!isValidMaxMarks) {
			       System.out.printf("Maximum marks should be greater than zero \n");
			    }
	   }
	   while(!isValidMaxMarks);
	   
	   do 
	   {
		    System.out.printf("Enter the marks obtained from test: \n");
		    isValidObtainedMarks = test.setMarksObtained(kbd.nextDouble());
		    if(!isValidObtainedMarks) {
		       System.out.printf("Obtained marks should be in range from %.2f to %.2f \n",Test.MIN_TEST_SCORE, test.getMaxMarks());
		    }
	   }
	   while(!isValidObtainedMarks);
			   
      return test;
	}
	
	public static void printTest(Test test) {
		System.out.printf("------------------ \n");
		System.out.printf("Test ID: %s \n", test.getTestId());
		System.out.printf("Max test score: %.2f \n", test.getMaxMarks());
		System.out.printf("Obtained test score: %.2f \n", test.getMarksObtained());
		System.out.printf("Test percentage: %.2f %%\n", test.getTestPercentage());
		System.out.printf("Test grade: %s \n", test.getTestGrade());
		System.out.printf("------------------ \n");
		
	}
}
