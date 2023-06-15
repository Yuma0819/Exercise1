import java.util.Random;
import java.util.Scanner;

class DiceGame{
    public static void main(String args[]){
	Random rand = new Random();
	int Die1 = rand.nextInt(6) + 1;
	int Die2 = rand.nextInt(6) + 1;
	Scanner sc = new Scanner(System.in);

	System.out.println("What is your name?");
	String name = sc.next();
	System.out.println("Hello, " + name);
	
	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + Die1);
	System.out.println("Die 2: " + Die2);
	int sum = Die1 + Die2;
	System.out.println("Total value: " + sum);
    }
}
