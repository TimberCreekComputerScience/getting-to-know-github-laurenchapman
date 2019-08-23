import java.util.Scanner;
public class Lemonade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("How much lemonade do you want?");
		int cost = 2;
		int amount = Scan.nextInt();
		double total = cost * amount;
		if (amount < 0){
			System.out.println("get out");
		}
		else {
				System.out.printf("Your total is: $%.2f", total);
			
		}
	}

}
