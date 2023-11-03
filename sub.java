public class SubtractTwoNumbers {
 
    public static void main(String[] args) {
 
        // declare required variables
        int x, y, subtract;
         
        // read first number
        x = Integer.parseInt(args[0]);
 
        // read second number
        y = Integer.parseInt(args[1]);
 
        // calculate the subtraction
        subtract = x - y;
 
        // print the calculated subtract value
        System.out.println("The subtraction of given two Numbers: " + subtract);
 
    }
 
}