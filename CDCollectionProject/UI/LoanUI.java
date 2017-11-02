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
        System.out.println("3 -   Check Current Loan   ");
        System.out.println("4 -   Return to Main Menu  ");
        System.out.println("        Enter a number(1-4)");
    }

    private void addNewLoan()
    {
        System.out.println("       New Loan Menu       ");
        System.out.println("---------------------------");

        System.out.println("   Enter Phone Number      ");
        String phoneNo = getUserInput();
        System.out.println("   Enter DVD name          ");
        String dvdCopy = getUserInput();
        System.out.println("   Enter Price             ");
        String price = getUserInput();
        
        loanController.addLoan(phoneNo,dvdCopy,price);
        printLoanDetails(phoneNo,dvdCopy,price);
    }

    private void returnLoan()
    {
        System.out.println("      Return Loan Menu     ");
        System.out.println("---------------------------");
        System.out.println("   Enter Phone Number      ");
        String phoneNo = getUserInput();
        System.out.println("   Enter DVD name          ");
        String dvdCopy = getUserInput();
        System.out.println("   Enter Price             ");
        String price = getUserInput();
        if(loanController.returnLoan(phoneNo,dvdCopy,price)) {
            System.out.println("     " + phoneNo + " has been successfully deleted");
        }
        else
        {
            System.out.println("An error occurred when attempting");
            System.out.println("    to delete " + phoneNo );
        }
    }

    private void checkCurrentLoan()
    {
        System.out.println("    Loan Details Menu    ");
        System.out.println("---------------------------");
        System.out.println("   Enter Phone Number      ");
        String phoneNo = getUserInput();
        
        loanController.getLoanDetails(phoneNo);
    }

    private void printLoanDetails(String phoneNo, String dvdCopy, String price)
    {
        System.out.println("      Friend Details       ");
        System.out.println("   Phone Number: " + phoneNo );
        System.out.println("   DVD Name: " + dvdCopy );
        System.out.println("   Price: " + price );
    }
}
