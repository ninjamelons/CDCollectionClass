package UI;
import java.util.Scanner;

/**
 * Write a description of class PersonUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonUI
{

    public PersonUI()
    {

    }

    private void go()
    {
        boolean finished = false;
        while(!finished)
        {
            printPersonMenu(); 
            int choice = getUserInput();
            switch(choice)
            {
                case 1:
                    printNewFriendMenu();
                    addNewFriend();
                    break;
                case 2:
                    printDeleteFriendMenu();
                    deleteFriend();
                    break;
                case 3:
                    printFriendStatusMenu();
                    checkFriendStatus();
                    break;
                case 4:
                    finished = true;
                default:
                    finished = true;
                    break;            
            }
        }
    }
    
    private void printPersonMenu()
    {
        System.out.println("        Friend Menu        ");
        System.out.println("---------------------------");
        System.out.println("1 -   Add New Friend      ");
        System.out.println("2 -   Delete Friend       ");
        System.out.println("3 -   Check Friend        ");
        System.out.println("4 -   Return to Main Menu ");
        System.out.println("        Enter a number(1-4)");
    }
    
    private int getUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }
    
    private void printNewFriendMenu()
    {
    }
    
    private void addNewFriend()
    {
    }
    
    private void printDeleteFriendMenu()
    {
    }
    
    private void deleteFriend()
    {
    }
    
    private void printFriendStatusMenu()
    {
    }
    
    private void checkFriendStatus()
    {
    }
}
