package UI;
import java.util.Scanner;
import Control.PersonController;

/**
 * Write a description of class PersonUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonUI
{
    private PersonController personController;

    public PersonUI()
    {
        personController = new PersonController();
    }

    private void go()
    {
        boolean finished = false;
        while(!finished)
        {
            String choice = getUserInput();
            printPersonMenu();
            switch(choice)
            {
                case "1":
                addNewFriend();
                break;
                case "2":
                deleteFriend();
                break;
                case "3":
                checkFriendStatus();
                break;
                case "4":
                finished = true;
                default:
                finished = true;
                break;            
            }
        }
    }

    private String getUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        return userInput;
    }

    private void printPersonMenu()
    {
        System.out.println("        Friend Menu        ");
        System.out.println("---------------------------");
        System.out.println("1 -   Add New Friend       ");
        System.out.println("2 -   Delete Friend        ");
        System.out.println("3 -   Check Friend         ");
        System.out.println("4 -   Return to Main Menu  ");
        System.out.println("        Enter a number(1-4)");
    }

    private void addNewFriend()
    {
        System.out.println("      New Friend Menu      ");
        System.out.println("   To cancel enter 'exit'  ");
        System.out.println("---------------------------");
        System.out.println(" Enter any key to continue ");
        if(getUserInput().equals("exit"))
        {
        }
        else
        {
            System.out.println("   Enter First & Last name ");
            String name = getUserInput();
            System.out.println("   Enter Address           ");
            String address = getUserInput();
            System.out.println("   Enter City name         ");
            String city = getUserInput();
            System.out.println("   Enter postal Code       ");
            String postalCode = getUserInput();
            System.out.println("   Enter Phone Number      ");
            String phoneNo = getUserInput();
            personController.addNewFriend(name,address,city,postalCode,phoneNo);
            printFriendDetails(name,address,city,postalCode,phoneNo);
        }
    }

    private void deleteFriend()
    {
        System.out.println("     Delete Friend Menu    ");
        System.out.println("---------------------------");
        System.out.println("   Enter First & Last name ");
        String name = getUserInput();
        personController.deleteFriend(name);
    }

    private void checkFriendStatus()
    {
    }

    private void printFriendDetails(String name, String address, String city,
    String postalCode, String phoneNo)
    {
        System.out.println("      Friend Details       ");
        System.out.println("   Name: " + name );
        System.out.println("   Address: " + address );
        System.out.println("   City: " + city );
        System.out.println("   Postal Code: " + postalCode );
        System.out.println("   Phone Number: " + phoneNo );
    }
}
