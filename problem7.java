// Write a program that take the command line input and print all received
// inputs

// Time Using : 5 min

public class problem7 {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("Not Available any input");
		}else {
			System.out.println("Input Recieved");
			for(String string :args) {
				System.out.println(string);
			}
		}
	}
}
