// Write a program that take the command line input and print all received
// inputs

// Time Using : 5 min

public class CommandLineInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
