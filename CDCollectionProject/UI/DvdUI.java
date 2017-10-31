package UI;

import java.util.Scanner;
import Control.DvdController;

public class DvdUI
{
    DvdController dvdCtr;
    int input;    
    Scanner reader;
    
    public DvdUI()
    {
        dvdCtr = new DvdController();
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
                    addNewDvd();
                    break;
                case 2:
                    System.out.println("u choosed Delete DVD");
                    break;
                case 3:
                    System.out.println("go back");
                    finished = true;
                    break;
                default:
                    System.out.println("u fuked up, try again");
                    break;
            }  
        }
    }
    
    private void printMenu()
    {
        System.out.println("\n    DVD UI");
        System.out.println("-----------------");
        System.out.println("1 - Add DVD");
        System.out.println("2 - Delete DVD");
        System.out.println("3 - Back");
        System.out.println("      Enter a number(1-3)");
    }
    
    private void addNewDvd()
    {
        long tempBarcode;
        String tempArtist, tempTitle;
        int tempPublicationDate;
        
        System.out.println("\nPlese type in the following details ");
        System.out.print("Barcode: ");
        tempBarcode = reader.nextLong();
        System.out.print("Title: ");
        tempTitle = reader.next();
        System.out.print("Artist: ");
        tempArtist = reader.next();
        System.out.print("PublicationDate: ");
        tempPublicationDate = reader.nextInt();
        dvdCtr.addDVD(tempBarcode,tempTitle,tempArtist,tempPublicationDate);
        System.out.println("You successfully added a new DVD");
    }
}
