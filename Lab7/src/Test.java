
public class Test {
	//Declaring Constants
    public static final double MIN_TEST_SCORE = 0, MAX_SCORE_PERC = 100, GRADE_A_PERC = 90, GRADE_B_PERC = 80, GRADE_C_PERC = 70, GRADE_D_PERC = 60; 
    
    //Declaring base value to assign id for each test
    public static int COUNT = 100;
    
    //Declaring class attributes
    private double obtainedTestScore, maxTestScore;
    private int id;
    
    //Defining possible constructors
    
    public Test(double maxTestScore, double obtainedTestScore) {
    	this.obtainedTestScore = obtainedTestScore;
    	this.maxTestScore = maxTestScore;
    	this.id = ++COUNT;
    }
    
    public Test(double maxTestScore) {
    	this(maxTestScore,MIN_TEST_SCORE);
    }
    
    public Test() {
    	this(MIN_TEST_SCORE,MAX_SCORE_PERC);
    }
    
    //Set Methods
    
    public boolean  setMaxMarks(double maxTestScore) {
    	if(maxTestScore > MIN_TEST_SCORE) {
    		this.maxTestScore = maxTestScore;
    		return true;
    	}
    	return false;
    }
    
    public boolean setMarksObtained(double obtainedTestScore) {
    	if(obtainedTestScore >= MIN_TEST_SCORE && obtainedTestScore < this.maxTestScore) {
    		this.obtainedTestScore = obtainedTestScore;
    		return true;
    	}
    	return false;
    }
    
    //Get Methods
    
    public int getTestId(){
    	return this.id;
    }
    
    public double getMaxMarks() {
    	return this.maxTestScore;
    }
    
    public double getMarksObtained() {
    	return this.obtainedTestScore;
    }
    
    public double getTestPercentage() {
    	return (this.obtainedTestScore / this.maxTestScore ) * MAX_SCORE_PERC;
    }
    
    public char getTestGrade() {
    	char grade = 'F';
    	if(this.getTestPercentage() >= GRADE_A_PERC) 
    		grade = 'A';
    	else if (this.getTestPercentage() >= GRADE_B_PERC && this.getTestPercentage() <= GRADE_A_PERC)
    		grade = 'B';
    	else if (this.getTestPercentage() >= GRADE_C_PERC && this.getTestPercentage() <= GRADE_B_PERC)
    		grade = 'C';
    	else if (this.getTestPercentage() >= GRADE_D_PERC && this.getTestPercentage() <= GRADE_C_PERC)
    		grade = 'D';
    	
    	return grade;
    }
    
    public String toString() {
    	return "ID:"+this.id+" , "+"Max Test Score: "+this.maxTestScore+" , Obtained Test Score:" + this.obtainedTestScore +" , Test Perecentage:"+
         this.getTestPercentage()+"% , Grade: "+this.getTestGrade();
    }
    
    public boolean equals(Test test) {
    	boolean same = false;
    	if(this.id == test.id &&  this.maxTestScore == test.getMaxMarks()) {
    		same = true;		
    	}
    	return same;
    }
    
}
