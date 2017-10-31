package UI;

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
            printStudentMenu(); 
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
    
    private void printStudentMenu()
    {
    }
    
    private int getUserInput()
    {
        return 0;
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
