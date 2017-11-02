package Model;

import Model.Dvd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

public class DvdContainer
{
    private HashSet<Dvd> dvd;
    public static DvdContainer instance = null;
    
    private DvdContainer()
    {
        dvd = new HashSet<Dvd>();
    }
    
    public static DvdContainer getInstance()
    {
        if(instance == null)
        {
            instance = new DvdContainer();
        }
        return instance;
    }
    
    public void addDVD(long tempBarcode,String tempTitle ,String tempArtist,int tempPublicationDate)
    {
       dvd.add(new Dvd(tempBarcode,tempTitle,tempArtist,tempPublicationDate));
    }
    
    public void deleteDVD(String name)
    {
        Iterator<Dvd> dvdIt = dvd.iterator();
        while(dvdIt.hasNext())
        {
            Dvd nextD = dvdIt.next();
            if(nextD.getTitle().equals(name))
            {
                dvdIt.remove();
                System.out.println("\nYou successfully deleted " + name);
            }
            else                
                System.out.println("\nSomething went wrong");
        }
    }
    
    public void listDVDs()
    {
       System.out.println();
       for (Dvd item : dvd) {
                System.out.println(item.getTitle());
            }
    }
}
