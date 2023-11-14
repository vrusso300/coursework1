package com.cw1;

class Dec2Hex
{
  
    //Add private access modifier to declaration so that the value cannot be accessed outwith the class
    //Following encapsulation principles
    private static int arg1 = 0;

    //Declare getters and setters
    public static int getarg1() {
        return arg1;
    }

    public static void setarg1(int value) {
        arg1 = value;
    } 

    public static void main(String[] args)
    {
        
        //Checking if String array args is empty, if so, print error statement
        if(args.length == 0)
        {
            System.out.println("Error: Please enter a denary value.");
        }
        //Else, run as normal
        else if(args.length ==1)
        {   
            //Try normal conversion, if error is detected - print error in catch statement
            try 
            {
                //Call set method to set the parsed input value
                setarg1(Integer.parseInt(args[0]));
                char[] ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                int rem;
                int num;
                //Get the arg1 value from the Arg1 method
                num = getarg1();
                String hexadecimal="";


                System.out.println("Converting the Decimal Value " + num + " to Hex...");


                //Initilise a new instance of the StringBuilder method as reference 'bld'
                StringBuilder bld =  new StringBuilder();

                while(num != 0)
                {   
                    rem=num%16;

                    //Append string to be the character of rem + hexadecimal 
                    bld.append(ch[rem] + hexadecimal);

                    num= num/16;
                }

                //Create new string to be = to the characters of the stringbuilder 
                String str = bld.toString();

                System.out.println("Hexadecimal representation is: " + str);
            } 
            //Error is caught, convert exception to string and print it
            catch (Exception e)
            {
                System.out.println(e.toString());
            }
            
        }
        else
        {
            System.out.println("Must only be 1 value.");
        }

    }
   
}


