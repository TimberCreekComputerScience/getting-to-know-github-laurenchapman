//gradebook class
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {

	public static void main(String[] args) {
	 
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> classRoster = new ArrayList<Student>();
		int option =-1;
		while (option != 5){
			
			System.out.println("Welcome to the GradeBook!\n"
					+ "1) Add New Student\n"
					+"2) Add New Assingnment\n"
					+"3) Print Roster\n"
					+"4) Drop Lowest Grade\n"
					+"5) Exit");
			
			option = scan.nextInt();
			scan.nextLine();
			if (option == 1){
				System.out.println("What is the new student's name?");
				String name = scan.nextLine();
				System.out.println("What is their grade level?");
				int grade = scan.nextInt();
				classRoster.add(new Student(name, grade));
			}else if ( option == 2){
				System.out.println("Mass Assign Grade:");
				int grade = scan.nextInt();
				for (int i = 0; i< classRoster.size(); i++){
					classRoster.get(i).addAssignment(grade);
				}
			}else if (option == 3){
				for (int i =0; i < classRoster.size(); i++){
					System.out.println(classRoster.get(i).toString());
				}
				System.out.println();
				System.out.println();
			}else if (option == 4){
				for (int i = 0; i < classRoster.size(); i++){
					classRoster.get(i).dropLowest();
				}
				
				
			}
			
			
		}
		
		
		

	}

}

//student class
import java.util.ArrayList;

public class Student {
	private String name;
	private int grade;
	private ArrayList<Integer> assignments;
	private double average;

	public Student(String n, int g) {

		name = n;
		grade = g;
		assignments = new ArrayList<Integer>();

	}

	public int getNumberOfAssignemnts() {
		return assignments.size();
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public String getScore() {
		String answer = "" + average;
		if (average == -1) {
			answer = "No Grade Given";
		} else if (average < 60) {
			answer += " F";
		} else if (average < 70) {
			answer += " D";
		} else if (average < 80) {
			answer += " C";
		} else if (average < 90) {
			answer += " B";
		} else {
			answer += " A";
		}
		return answer;
	}

	public String toString() {
		String temp = "";
		for (int i : assignments) {
			temp += i + ", ";
		}
		temp = temp.substring(0, temp.length() - 2);
		temp += " " + getScore();
		return temp;

	}

	public void addAssignment(int s) {
		assignments.add(s);
		int total = 0;
		for (int i = 0; i < assignments.size(); i++) {
			total += assignments.get(i);
		}
		average = (double) total / assignments.size();
	}

	public void dropLowest() {
		int lowest = Integer.MAX_VALUE;
		int total = 0;
		for (int i = 0; i < assignments.size(); i++) {
			total += assignments.get(i);
			if (lowest > assignments.get(i)) {
				lowest = assignments.get(i);
			}
		}
		total -= lowest;
		average = (double) total / assignments.size();
	}
}
