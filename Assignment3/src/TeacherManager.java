import java.util.Scanner;

public class TeacherManager {

	public static Teacher createTeacher() {

		// Object of scanner class
		Scanner kbd = new Scanner(System.in);

		// Object of teacher class
		Teacher teacher = new Teacher();

		// Taking user inputs
		System.out.printf("Enter the Teacher ID \n");
		teacher.setTeacherId(kbd.nextInt());

		kbd.nextLine();

		System.out.printf("Enter the Teacher Name \n");
		teacher.setTeacherName(kbd.nextLine());

		return teacher;
	}

	public static void printTeacher(Teacher teacher) {
		System.out.printf("Teacher ID is: %d \n", teacher.getTeacherId());
		System.out.printf("Teacher Name is: %s \n", teacher.getTeacherName());
		System.out.printf("--------------- \n");
	}
}
