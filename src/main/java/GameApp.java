import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		//Get the values of n and k
		System.out.println("Enter the value of n indicating the number of chidren playing this game");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println("Enter the value of k for which the child gets out");
		int k = scanner.nextInt();
		
		if(GameBegin.play(n, k)!=null){
			System.out.println("The winning id is " + GameBegin.play(n, k).get(n-1)); 
			
		}
		else{
			System.out.println("Please restart the game with the correct value of n and k for this game");
			return;
		}		

	}

}
