package Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the course code: ");
		String code = input.nextLine();
		
		System.out.println("Enter the course name: ");
		String name = input.nextLine();
		
		System.out.println("Enter the grades -it will exit if you enter 0-.");
		ArrayList<Double> grades = new ArrayList<>();
		input.nextLine();
		double grade;
		do {
			grade = input.nextDouble();
			grades.add(grade);
		} while (grade != 0);
		
		grades.remove(grades.size()-1);

	}

}
