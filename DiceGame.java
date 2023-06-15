import java.util.Random;

class DiceGame{
    public static void main(String args[]){
	Random rand = new Random();
	int Die1 = rand.nextInt(6) + 1;
	int Die2 = rand.nextInt(6) + 1;

	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + Die1);
	System.out.println("Die 2: " + Die2);
	int sum = Die1 + Die2;
	System.out.println("Total value: " + sum);
	if(sum > 7){
	    System.out.println("You won");
		}else{
	    System.out.println("You lost");
		}
	
    }
}
