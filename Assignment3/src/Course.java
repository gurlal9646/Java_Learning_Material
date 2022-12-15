
public class Course {

	// Constants
	public static final int COURSE_CRN = 4613;
	public static final String COURSE_CODE = "ITE 5231", COURSE_NAME = "Data Structure and Design pattern",
			COURSE_DAY = "Monday", COURSE_TIME = "7:00 PM TO 10:00 PM", COURSE_ROOM_NUMBER = "IGS 609";

	// Class atributes
	private int courseCrn;
	private String courseCode, courseName, courseDay, courseTime, courseRoomNumber;
    
	//Constructors
	public Course() {
		this.setcourseCrn(COURSE_CRN);
		this.setcourseCode(COURSE_CODE);
		this.setcourseName(COURSE_NAME);
		this.setcourseDay(COURSE_DAY);
		this.setcourseTime(COURSE_TIME);
		this.setcourseRoomNumber(COURSE_ROOM_NUMBER);
	}

	public Course(int courseCrn, String courseCode, String courseName, String courseDay, String courseTime,
			String courseRoomNumber) {
		this.setcourseCrn(courseCrn);
		this.setcourseCode(courseCode);
		this.setcourseName(courseName);
		this.setcourseDay(courseDay);
		this.setcourseTime(courseTime);
		this.setcourseRoomNumber(courseRoomNumber);
	}

	// Get Methods

	public int getcourseCrn() {
		return this.courseCrn;
	}

	public String getcourseCode() {
		return this.courseCode;
	}

	public String getcourseName() {
		return this.courseName;
	}

	public String getcourseDay() {
		return this.courseDay;
	}

	public String getcourseTime() {
		return this.courseTime;
	}

	public String getcourseRoomNumber() {
		return this.courseRoomNumber;
	}

	// Set Methods

	public void setcourseCrn(int courseCrn) {
		this.courseCrn = courseCrn;
	}

	public void setcourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public void setcourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setcourseDay(String courseDay) {
		this.courseDay = courseDay;
	}

	public void setcourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	public void setcourseRoomNumber(String courseRoomNumber) {
		this.courseRoomNumber = courseRoomNumber;
	}

}
