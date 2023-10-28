import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        String yesNo = "";
        double totalPrice = 0;
        boolean done = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter price of item", .50, 10);
            yesNo = String.valueOf(SafeInput.getYNConfirm(in, "Do you have more items"));

            if(yesNo.equals(String.valueOf(false)))
            {
                done = true;
            }

            totalPrice = totalPrice + itemPrice;

        }while(!done);

        System.out.printf("Your total price is %.2f", totalPrice);

    }
}
