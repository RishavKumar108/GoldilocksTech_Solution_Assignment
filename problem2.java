import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Write a program to read a CSV file and print the same in the output file.
//This csv file contains three columns having numeric value. The output file
//should additionally contain the sum of these numeric values.
public class problem2 {

	public static void main(String[] args) {
		 String f1 =  "C:\\Users\\Rishav Malhotra\\Desktop\\Some\\Rishav_fw19_0800\\Assignment_Goldilock\\src\\main\\java\\com\\rishav\\problem2\\input.csv";
	     String f2 = "output.csv"; 
	     ReadCSVFile(f1,f2);
	     System.out.println("Read File Successfully");
	}
	public static void ReadCSVFile(String f1, String f2) {
	     try (BufferedReader reader = new BufferedReader(new FileReader(f1));
	          BufferedWriter writer = new BufferedWriter(new FileWriter(f2))) {

	         String line;
	         boolean flag = true;

	         while ((line = reader.readLine()) != null) {
	            
	        	 String[] data = line.split(",");
	             int sum = valueAdded(data);
	             String newLine = line + "," + sum;

	             if (flag) {
	                 flag = false;
	             } else {
	                 writer.newLine();
	             }

	             writer.write(newLine);
	         }

	     } catch (IOException e) {
	         e.printStackTrace();
	     }
	 }

	 public static int valueAdded(String[] data) {
	     int sum = 0;
	     for (String value : data) {
	         sum += Integer.parseInt(value);
	     }
	     return sum;
	 }
	}