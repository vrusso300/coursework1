import java.util.Scanner;
//Comment
class Dec2Hex
{

    public static int Arg1;
    //This is a test for git push to remote pos.
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
                Arg1 = Integer.parseInt(args[0]);
                char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                int rem, num;
                num = 15;
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
