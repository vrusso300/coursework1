
class Dec2Hex
{
  
    //Add private access modifier to declaration so that the value cannot be accessed outwith the class
    private static int Arg1 = 0;

    //Declare getters and setters
    public static int getArg1() {
        return Arg1;
    }

    public static void setArg1(int value) {
        Arg1 = value;
    } 

    public static void main(String args[])
    {
        
        //Checking if String array args is empty, if so, print error statement
        if(args.length == 0)
        {
            System.out.println("Error: Please enter a denary value.");
        }
        //Else, run as normal
        else
        {   
            //Try normal conversion, if error is detected - print error in catch statement
            try 
            {
                //Call set method to set the parsed input value
                setArg1(Integer.parseInt(args[0]));
                char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                int rem, num;
                //Get the arg1 value from the Arg1 method
                num = getArg1();
                String hexadecimal="";


                System.out.println("Converting the Decimal Value " + num + " to Hex...");

                while(num != 0)
                {   
                    rem=num%16;
                    hexadecimal= ch[rem] + hexadecimal;
                    num= num/16;
                }

                System.out.println("Hexadecimal representation is: " + hexadecimal);
            } 
            //Error is caught, convert exception to string and print it
            catch (Exception e)
            {
                System.out.println(e.toString());
            }
            
        }

    }
}


