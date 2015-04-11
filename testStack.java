/*U10316035
 *Lin Tz Hau
 */
 //import Scanner
import java.util.Scanner;
 //the test program
public class testStack{
	//main method
	public static void main(String[] args){
		//create a MyStack arraylist to store original Strings that user inputs
		MyStack<String> stackBefore = new MyStack<String>();
		//create a MyStack arraylist to store the reverse order of prvious one
		MyStack<String> stackAfter = new MyStack<String>();
		//create a Scanner
		Scanner input = new Scanner(System.in);
		//force user to input Strings and store in stackBefore arraylist
		for(int i = 0;i < 5;i++){
			System.out.print("enter a String : ");
			String string = input.nextLine();
			stackBefore.push(string);
		}
		//reverse stackBefore arraylist and store in stackAfter arraylist
		for(int j = 0;j < 5;j++){
			stackAfter.push(stackBefore.pop());
		}
		//print out reversed one
		System.out.println(stackAfter.toString());
	}
}
