import java.util.Scanner;

public class SafeInput
{
    /**
     * returns a String input by the user that must be at least one character
     * @param pipe the scanner to use for the input
     * @param prompt the message for the user telling them what to input
     * @return a String of at least one character
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = "";

        do
        {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();

            if(response.length() > 0)
            {
                done= true;
            }
            else
            {
                System.out.println("\nYou must enter at least one character! \n");
            }
        }while(!done);

        return response;
    }
    
    /**
     * gets an int value from the user with no constraints
     * @param pipe the scanner to use for the input
     * @param prompt message to user for what to enter
     * @return any valid int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        int value = 0;


        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine(); // Clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number, You entered: " + trash);
            }
        }while(!done);

        return value;
    }
}
