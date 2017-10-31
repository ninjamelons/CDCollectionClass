package UI;
import java.util.Scanner;

public class MainMenuUI
{
    private Scanner reader;
    private PersonUI pUI;
    private DvdUI dvdUI;
    
    public MainMenuUI()
    {
        reader = new Scanner(System.in);
        pUI = new PersonUI();
        dvdUI = new DvdUI();
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
                    System.out.println("u choosed Friends");
                    break;
                case 2:
                    System.out.println("u choosed DVDs");
                    break;
                case 3:
                    System.out.println("u choosed Loan");
                    break;
                case 4:
                    System.out.println("u choosed Close");
                    finished = true;
                    break;
                default:
                    System.out.println("u fuked up, try again");
                    break;
            }  
        }
    }
    
    private void printMainMenu()
    {
        System.out.println("        Main Menu          ");
        System.out.println("---------------------------");
        System.out.println("1 -   Friends             ");
        System.out.println("2 -   DVDs                ");
        System.out.println("3 -   Loan                ");
        System.out.println("4 -   Exit               ");
        System.out.println("        Enter a number(1-4)");
    }
}
