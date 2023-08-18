
import java.util.* ;
public class Note
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
		int[] nA = new int[notes.length];
		System.out.print("Enter Amount: ");
		int amount = sc.nextInt();
		for (int i = 0; i < notes.length; i++){
		    if (amount >= notes[i]){
		        nA[i] = amount/notes[i] ;
		        amount = amount%notes[i] ;
		    }
		} 
		for (int j = 0; j < nA.length; j++){
		    if (nA[j] != 0){
		        System.out.print(notes[j] + " : " + nA[j]);
		        System.out.println();
		    } 
		} 
	}
}
