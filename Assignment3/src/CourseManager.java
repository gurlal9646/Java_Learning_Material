import java.util.StringTokenizer;

public class CourseManager {

	// Default data objects for courses
	static Course courseOneObj;
	static Course courseTwoObj;
	static Course courseThreeObj;
	static Course courseFourObj;
	static Course courseFiveObj;

	public static void setDefaultDataObject() {
		courseOneObj = new Course(4613, "ITE 5321", "Data Structures and Design Patterns", "Monday",
				"7:00 PM TO 10:00 PM", "IGS 609");
		courseTwoObj = new Course(4571, "ITC 5201", "Database programming using java", "Wednesday",
				"4:00 PM TO 7:00 PM", "IGS 609");
		courseThreeObj = new Course(4600, "ITE 5220", "Oracle database programming using PL/SQL", "Friday",
				"4:00 PM TO 7:00 PM", "IGS 609");
		courseFourObj = new Course(4607, "ITE 5223", "SQL server database development", "Friday", "7:00 PM TO 10:00 PM",
				"IGS 609");
		courseFiveObj = new Course(4609, "ITE 5230", "Windows application development using C sharp", "Monday",
				"12:00 PM TO 3:00 PM", "IGS 609");
	}

	// This method used to find given crn number is valid or not
	public static boolean checkValidCrn(int courseCrn) {

		boolean isValid = false;
		if (courseOneObj.getcourseCrn() == courseCrn) {
			isValid = true;
		} else if (courseTwoObj.getcourseCrn() == courseCrn) {
			isValid = true;
		} else if (courseThreeObj.getcourseCrn() == courseCrn) {
			isValid = true;
		} else if (courseFourObj.getcourseCrn() == courseCrn) {
			isValid = true;
		} else if (courseFiveObj.getcourseCrn() == courseCrn) {
			isValid = true;
		}

		return isValid;

	}

	// This method used to return course based on passed crn number
	public static Course getCourseByCrn(int courseCrn) {
		Course resultCourseObj = new Course();
		if (courseOneObj.getcourseCrn() == courseCrn) {
			resultCourseObj = courseOneObj;
		} else if (courseTwoObj.getcourseCrn() == courseCrn) {
			resultCourseObj = courseTwoObj;
		} else if (courseThreeObj.getcourseCrn() == courseCrn) {
			resultCourseObj = courseThreeObj;
		} else if (courseFourObj.getcourseCrn() == courseCrn) {
			resultCourseObj = courseFourObj;
		} else if (courseFiveObj.getcourseCrn() == courseCrn) {
			resultCourseObj = courseFiveObj;
		}
		return resultCourseObj;
	}

	// This method used to print the details for given course
	public static void printCourse(Course course) {
		System.out.printf("Course Crn is: %d \n", course.getcourseCrn());
		System.out.printf("Course Code is: %s \n", course.getcourseCode());
		System.out.printf("Course Name is: %s \n", course.getcourseName());
		System.out.printf("Course Day is: %s \n", course.getcourseDay());
		System.out.printf("Course Time is: %s \n", course.getcourseTime());
		System.out.printf("Course Room Number is: %s \n", course.getcourseRoomNumber());
		System.out.printf("-------------- \n");

	}

	// This method used to find given crn number is already exist or not
	public static boolean checkCrnExist(String allCrnNumbers, int crnNumber) {
		boolean isExist = false;
		StringTokenizer tokenizer = new StringTokenizer(allCrnNumbers, ",");
		while (tokenizer.hasMoreTokens()) {
			if (crnNumber == Integer.parseInt(tokenizer.nextToken())) {
				isExist = true;
				break;
			}
		}
		return isExist;

	}

}
