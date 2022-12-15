import java.util.Scanner;
import java.util.StringTokenizer;

public class MainApp {

	public static void main(String[] args) {

		System.out.printf("Designed and Developed by Gurlal Singh \n");
		System.out.printf(
				"Make sure to enter following Crn number to get the schedule :\n 1.)4600 \n 2.)4607 \n 3.)4613 \n 4.)4609 \n 5.)4571 \n");

		// Object of scanner class
		Scanner kbd = new Scanner(System.in);

		CourseManager.setDefaultDataObject();
		Teacher teacher = TeacherManager.createTeacher();

		// Declaring variables
		boolean isValidCrn, isCrnExist = false;
		String option = "";
		String allCrnNumbers = "";
		int count = 0;

		do {
			do {
				int crnNumber = 0;
				System.out.printf("Enter the Course CRN Number");
				crnNumber = kbd.nextInt();
				isValidCrn = CourseManager.checkValidCrn(crnNumber);
				if (isValidCrn) {
					isCrnExist = CourseManager.checkCrnExist(allCrnNumbers, crnNumber);
					if (!isCrnExist) {
						allCrnNumbers = allCrnNumbers + String.valueOf(crnNumber) + ",";
						count++;
					} else {
						System.out.printf("Crn number %d already exist. Please try with different one from the list.\n",
								crnNumber);
					}
				} else {
					System.out.printf("Please enter the Valid Course CRN Number from the given list \n");
				}

			} while (!isValidCrn || isCrnExist);

			if (count == 5) {
				break;
			} else {
				kbd.nextLine();
				System.out.printf("Do you have any other course to get the schedule? \n");
				option = kbd.nextLine();
			}

		} while (option.equalsIgnoreCase("Yes"));

		TeacherManager.printTeacher(teacher);
		StringTokenizer tokenizer = new StringTokenizer(allCrnNumbers, ",");
		while (tokenizer.hasMoreTokens()) {
			Course course = CourseManager.getCourseByCrn(Integer.parseInt(tokenizer.nextToken()));
			CourseManager.printCourse(course);
		}

	}

}
