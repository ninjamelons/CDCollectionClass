package UI;
import java.util.Scanner;
import Control.LoanController;

/**
 * Write a description of class PersonUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanUI
{
    private LoanController loanController;

    public LoanUI()
    {
        loanController = new LoanController();
    }

    public void go()
    {
        boolean finished = false;
        while(!finished)
        {
            printLoanMenu();
            String choice = getUserInput();
            switch(choice)
            {
                case "1":
                    addNewLoan();
                    break;
                case "2":
                    returnLoan();
                    break;
                case "3":
                    checkCurrentLoan();
                    break;
                case "4":
                    finished = true;
                    break;
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

    private void printLoanMenu()
    {
        System.out.println("         Loan Menu         ");
        System.out.println("---------------------------");
        System.out.println("1 -   Add New Loan         ");
        System.out.println("2 -   Return Loan          ");
        System.out.println("3 -   Check Current Loans  ");
        System.out.println("4 -   Return to Main Menu  ");
        System.out.println("        Enter a number(1-4)");
    }

    private void addNewPerson()
    {
        System.out.println("       New Loan Menu       ");
        System.out.println("---------------------------");

        System.out.println("   Enter First & Last name ");
        String name = getUserInput();
        System.out.println("   Enter DVD name          ");
        String dvd = getUserInput();
        System.out.println("   Enter Price             ");
        String price = getUserInput();
        
        loanController.addLoan(name,dvd,price);
        printLoanDetails(name,dvd,price);
    }

    private void returnLoan()
    {
        System.out.println("      Return Loan Menu     ");
        System.out.println("---------------------------");
        System.out.println("   Enter First & Last name ");
        String name = getUserInput();
        if(loanController.returnLoan(name,dvd,)) {
            System.out.println("     " + name + " has been successfully deleted");
        }
        else
        {
            System.out.println("An error occurred when attempting");
            System.out.println("    to delete " + name );
        }
    }

    private void checkCurrentLoans()
    {
        System.out.println("    Friend Details Menu    ");
        System.out.println("---------------------------");
        System.out.println("   Enter First & Last name ");
        String name = getUserInput();
        
        personController.getPersonDetails(name);
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
