import java.util.ArrayList;

public class GameBegin {

	static ArrayList<Integer> play(int n, int k) 
	{ 
		//Checks for valid values of n and k
		if(n<=0){
			System.out.println("The value of n must be greater than 1");
			return null;
		}
		
		else if(k<=0 || k>n){
			System.out.println("The value of k must be between 1 and n");
			return null;
		}
		
		else{
			int ids = 0;
	        ArrayList<Integer> children = new ArrayList<Integer>(n);
	        ArrayList<Integer> outOfTheGame = new ArrayList<Integer>(n);
	        for(int i = 1;i <= n;i++){
	            children.add(i);
	        }
	        System.out.println(children.toString());
	        System.out.println("Children get out in the order:");
	        while(children.size() >= 1){
	            ids = (ids + k - 1) % children.size();
	            int out = children.get(ids);
	            outOfTheGame.add(out);
	            System.out.print(children.get(ids) + " ");
	            children.remove(ids);
	            
	        }
	        System.out.println();
	        return outOfTheGame;
		}
		
	} 
}
