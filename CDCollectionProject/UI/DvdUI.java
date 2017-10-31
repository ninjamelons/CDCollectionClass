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
                    System.out.println("u choosed Add DVD");
                    addNewDvd();
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
    
    private void addNewDvd()
    {
        long tempBarcode;
        String tempArtist, tempTitle;
        int tempPublicationDate;
        
        System.out.println("Plese type in the following details");
        System.out.print("Barcode: ");
        tempBarcode = reader.nextLong();
        System.out.print("\nTitle: ");
        tempTitle = reader.nextLine();
        System.out.print("\nArtist: ");
        tempArtist = reader.nextLine();
        System.out.print("PublicationDate: ");
        tempPublicationDate = reader.nextInt();
        dvdCtr.addDVD(tempBarcode,tempTitle,tempArtist,tempPublicationDate);
    }
}
