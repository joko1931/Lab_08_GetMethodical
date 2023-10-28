import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ssnRegEx = "\\d{3}-\\d{2}-\\d{4}$";
        String mNumberRegEx = "(M|m)\\d{5}$";
        String menuChoiceRegEx = "[OoSsVvQq]$";

        String ssn = "";
        String mNumber = "";
        String menuChoice = "";

        ssn = SafeInput.getRegExString(in, "Enter your SSN", ssnRegEx);
        mNumber = SafeInput.getRegExString(in, "Enter your M Number", mNumberRegEx);
        menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", menuChoiceRegEx);

        System.out.println("Your SSN is " + ssn);
        System.out.println("Your M number is " + mNumber);
        System.out.println("Your menu choice is " + menuChoice);
    }
}
