package UI;

import java.util.Scanner;

public class DvdUI
{
    // private DvdController dvdCtr;
    private int input;    
    private Scanner reader;
    
    public DvdUI()
    {
        //     dvdCtr = new DvdController();
        reader = new Scanner(System.in);
    }
    
    public void start()
    {
        boolean finished = false;
        
        while(!finished) {
            
            printMenu();            
            input = reader.nextInt();            
            switch(input)
            {
                case 1:
                    System.out.println("u choosed Add DVD");
                    break;
                case 2:
                    System.out.println("u choosed Delete DVD");
                    break;
                default:
                    System.out.println("u fuked up, try again");
                    break;
            }  
        }
    }
    
    private void printMenu()
    {
        System.out.println("        DVD UI");
        System.out.println("---------------------------");
        System.out.println("1 -     Add DVD");
        System.out.println("2 -     Delete DVD");
        System.out.println("          Make your choice");
    }
}
