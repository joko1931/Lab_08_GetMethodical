import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int yearInt = 0;
        int monthInt = 0;
        int dayInt = 0;
        int hourInt = 0;
        int minuteInt = 0;

        yearInt = SafeInput.getRangedInt(in, "Enter year you were born", 1950, 2015);
        monthInt = SafeInput.getRangedInt(in, "Enter month you were born", 1, 12);
        switch (monthInt)
        {
            case 1,3,5,7,8,10,12 -> dayInt = SafeInput.getRangedInt(in, "Enter day you were born", 1, 31);
            case 4,6,9,11 -> dayInt = SafeInput.getRangedInt(in, "Enter day you were born", 1, 30);
            case 2 -> dayInt = SafeInput.getRangedInt(in, "Enter day you were born", 1, 29);
        }
        hourInt = SafeInput.getRangedInt(in, "Enter hour you were born", 1, 24);
        minuteInt = SafeInput.getRangedInt(in, "Enter minute you were born", 1, 59);
        System.out.println("You were born at " + hourInt + ":" + minuteInt + " in month " + monthInt + " day " + dayInt +", " + yearInt);
    }
}
