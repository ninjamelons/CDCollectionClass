package UI;
import java.util.Scanner;

public class MainMenuUI
{
    private Scanner reader;
    private PersonUI pUI;
    private DvdUI dvdUI;
    private LoanUI loanUI;
    
    public MainMenuUI()
    {
        reader = new Scanner(System.in);
        pUI = new PersonUI();
        dvdUI = new DvdUI();
        loanUI = new LoanUI();
    }
    
    public void start()
    {
        boolean finished = false;
        
        while(!finished) {
            printMainMenu();            
            int input = reader.nextInt();
            switch(input)
            {
                case 1:
                    pUI.go();
                    break;
                case 2:
                    dvdUI.start();
                    break;
                case 3:
                    loanUI.go();
                    break;
                case 4:
                    finished = true;
                    break;
                default:
                    System.out.println("Please enter a digit 1-4");
                    break;
            }  
        }
    }
    
    private void printMainMenu()
    {
        System.out.println("\n        Main Menu          ");
        System.out.println("---------------------------");
        System.out.println("1 -   Friends             ");
        System.out.println("2 -   DVDs                ");
        System.out.println("3 -   Loan                ");
        System.out.println("4 -   Exit               ");
        System.out.println("        Enter a number(1-4)");
    }
}
