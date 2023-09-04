import java.util.Scanner;
// 1. Write a function to convert a decimal number string into binary string.
// For example, string A contains “123” which is decimal value 123. Convert
// this string into binary string.

//Time Using : 25 to 30 min.
public class problem1 {

     public static String decimalToBinary(int decimal) {
        if (decimal < 0) {
            throw new ArithmeticException("Please Enter a Valid Number");
        }
        if (decimal== 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            sb.insert(0, remainder);
            decimal /= 2;
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a decimal number: ");
            String dString = sc.nextLine();
            int dValue = Integer.parseInt(dString);
            String bString = binaryConverter(dValue);
            System.out.println("Binary Converter " + bString);

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid decimal number.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); 
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
    }

   
}

