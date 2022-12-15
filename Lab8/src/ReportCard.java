
public class ReportCard {
		
   //Declaring attributes of class	
   private String studentName;
   private double assignmentOneScore, assignmentTwoScore, midTermScore, finalTermScore;
   
   ReportCard(){
	   this.setStudentName(AppConstants.DEFAULT_STUDENT_NAME);
	   this.setAssignmentOneScore(AppConstants.MIN_MIDTERM_ASSIGMENT_SCORE);
	   this.setAssignmentTwoScore(AppConstants.MIN_MIDTERM_ASSIGMENT_SCORE);
	   this.setMidTermScore(AppConstants.MIN_MIDTERM_ASSIGMENT_SCORE);
	   this.setFinalTermScore(AppConstants.MIN_MIDTERM_ASSIGMENT_SCORE);
   }
   
   //Set Methods
   
   public void setStudentName(String studentName) {
	   this.studentName = studentName;
   }
   
   public boolean setAssignmentOneScore(double assignmentOneScore) {
	   if(assignmentOneScore >= AppConstants.MIN_MIDTERM_ASSIGMENT_SCORE && assignmentOneScore <= AppConstants.MAX_ASSIGNMENT_SCORE) {
		   this.assignmentOneScore = assignmentOneScore;
		   return true;
	   }
	   return false;
   }
   
   public boolean setAssignmentTwoScore(double assignmentTwoScore) {
	   if(assignmentTwoScore >= AppConstants.MIN_MIDTERM_ASSIGMENT_SCORE && assignmentTwoScore <= AppConstants.MAX_ASSIGNMENT_SCORE) {
		   this.assignmentTwoScore = assignmentTwoScore;
		   return true;
	   }
	   return false;
   }
   
   public boolean setMidTermScore(double midTermScore) {
	   if(midTermScore >= AppConstants.MIN_MIDTERM_ASSIGMENT_SCORE && midTermScore <= AppConstants.MAX_MIDTERM_SCORE) {
		   this.midTermScore = midTermScore;
		   return true;
	   }
	   return false;
   }
   
   public boolean setFinalTermScore(double finalTermScore) {
	   if(finalTermScore >= AppConstants.MIN_MIDTERM_ASSIGMENT_SCORE && finalTermScore <= AppConstants.MAX_MIDTERM_SCORE) {
		   this.finalTermScore = finalTermScore;
		   return true;
	   }
	   return false;
   }
   
   //Get Methods
   
   public String getStudentName() {
	   return this.studentName;
   }
   
   public double getAssignmentOneScore() {
	   return this.assignmentOneScore;
   }
   
   public double getAssignmentTwoScore() {
	   return this.assignmentTwoScore;
   }
   
   public double getMidTermScore() {
	   return this.midTermScore;
   }
   
   public double getFinalTermScore() {
	   return this.finalTermScore;
   }
   
   public double getAssignmentTotal() {
	   return this.assignmentOneScore + this.assignmentTwoScore;
   }
   
   public double getTestTotal() {
	   return this.midTermScore + this.finalTermScore;
   }
   
   public double getOverallScore() {
	   return this.assignmentOneScore + this.assignmentTwoScore +  this.midTermScore + this.finalTermScore;
   }
   
}
