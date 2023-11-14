package com.cw1;
class Dec2Hex {
    //Testing Testing Another Testing
    // Add private access modifier to declaration so that the value cannot be accessed outwith the class
    // Following encapsulation principles
    private static int arg1 = 0;

    // Declare getter and setter
    public static int getArg1() {
        return arg1;
    }

    public static void setArg1(int value) {
        arg1 = value;
    } 

    public static String convertToHex(int decimalNo) {

        // Initialize char collection with hexadecimal values
        char[] ch = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        int num = decimalNo;

        // Initialize a new instance of the StringBuilder method as reference 'bld'
        StringBuilder bld = new StringBuilder();

        // While loop to convert into hexadecimal
        while (num != 0) {   
            rem = num % 16;

            // Append to be the pos of rem in ch collection
            bld.append(ch[rem]);
            num = num / 16;
        }

        // Create new string to be = to the characters of the StringBuilder and reverse it, return it 
        return bld.reverse().toString();

        
    }

    public static void main(String[] args) {
        
        // Checking if String array args is empty, if so, print an error statement
        if (args.length == 0) {
            System.out.println("Error: Please enter a denary value.");
        } 
        // Else, run as normal
        else if (args.length == 1) {   
            // Try normal conversion, if an error is detected - print error in the catch statement
            try {
                // Call set method to set the parsed input value
                setArg1(Integer.parseInt(args[0]));
                
                // Get the arg1 value from the getArg1 method
                int num = getArg1();

                // Local variable hexadecimal = to the returned number from convertToHex method
                String hexadecimal = convertToHex(num);

                // Print the decimal
                System.out.println("Converting the Decimal Value " + num + " to Hex...");

                // Print the hexadecimal
                System.out.println("Hexadecimal representation is: " + hexadecimal);
            } 
            // Error is caught, convert exception to string and print it
            catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        // Else, print an error    
        else {
            System.out.println("Error: must only be 1 value.");
        }
    }
}
