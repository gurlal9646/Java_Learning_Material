
public class Teacher {

	// Declaring Constants
	public static int DEFAULT_TEACHER_ID = 1000;
	public static String DEFAULT_TEACHER_NAME = "Gurlal Singh";

	// Declaring attributes for teacher class
	private int teacherId;
	private String teacherName;

	// Constructors
	public Teacher() {
		this.setTeacherId(DEFAULT_TEACHER_ID);
		this.setTeacherName(DEFAULT_TEACHER_NAME);
	}

	public Teacher(int teacherId) {
		this.setTeacherId(teacherId);
		this.setTeacherName(DEFAULT_TEACHER_NAME);
	}

	public Teacher(int teacherId, String teacherName) {
		this(teacherId);
	}

	// Set Methods

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	// Get methods

	public int getTeacherId() {
		return this.teacherId;
	}

	public String getTeacherName() {
		return this.teacherName;
	}

	public String toString() {
		return "Teacher ID:" + this.teacherId + "," + "Teacher Name" + this.teacherName;
	}

	public boolean equals(Course course1, Course course2) {
		boolean same = false;
		if (course1.getcourseCrn() == course2.getcourseCrn()) {
			same = true;
		}
		return same;
	}

}
