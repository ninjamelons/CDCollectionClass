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

    public void go()
    {
        boolean finished = false;
        while(!finished)
        {
            printPersonMenu();
            String choice = getUserInput();
            switch(choice)
            {
                case "1":
                addNewPerson();
                break;
                case "2":
                deletePerson();
                break;
                case "3":
                checkPersonStatus();
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

    private void addNewPerson()
    {
        System.out.println("      New Friend Menu      ");
        System.out.println("---------------------------");

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
        personController.addPerson(name,address,city,postalCode,phoneNo);
        printPersonDetails(name,address,city,postalCode,phoneNo);
    }

    private void deletePerson()
    {
        System.out.println("     Delete Friend Menu    ");
        System.out.println("---------------------------");
        System.out.println("   Enter Phone Number      ");
        String phoneNo = getUserInput();
        if(personController.deletePerson(phoneNo)) {
            System.out.println("     " + phoneNo + " has been successfully deleted");
        }
        else
        {
            System.out.println("An error occurred when attempting");
            System.out.println("    to delete " + phoneNo );
        }
    }

    private void checkPersonStatus()
    {
        System.out.println("    Friend Details Menu    ");
        System.out.println("---------------------------");
        System.out.println("   Enter Phone Number      ");
        String phoneNo = getUserInput();
        
        personController.getPersonDetails(phoneNo);
    }

    private void printPersonDetails(String name, String address, String city,
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
