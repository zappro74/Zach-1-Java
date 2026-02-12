import java.util.Scanner;

class Program
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your own adventure!");

        System.out.println("You wake up in the city of Albuquerque, New Mexico.");
        System.out.println("Do you: ");
        System.out.println("1. break bad.");
        System.out.println("2. turn left.");
        System.out.println("3. rent a room at the Holiday Inn.");
        System.out.println("4. get a job a Sizzler.");
        int choice = input.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Would you like to cook meth?");
                System.out.println("1. Yes!");
                System.out.println("2. Hell no!");
                int breakBad = input.nextInt();
                break;

            case 2:
                System.out.println("Is it rabbit season or duck season?");
                int season = input.nextInt();
                break;
            
            case 3:
                System.out.println("A man offers to shave your back for a nickel. Do you accept?");
                int nickel = input.nextInt();
                break;
            
            case 4:
                System.out.println("Will you work hard, or slack off?");
                int workEthic = input.nextInt();
                break;
        }

        switch (breakBad) {
            case 1:
                break;
        }

    }
}