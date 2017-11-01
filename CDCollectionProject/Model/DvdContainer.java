package Model;

import Model.Dvd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

public class DvdContainer
{
    ArrayList<Dvd> dvds;
    HashSet<Dvd> dvdHashSet;
    
    public DvdContainer()
    {
        dvds = new ArrayList<Dvd>();
    }
    
    public void addDVD(long tempBarcode,String tempTitle ,String tempArtist,int tempPublicationDate)
    {
       dvds.add(new Dvd(tempBarcode,tempTitle,tempArtist,tempPublicationDate));
    }
    
    public void deleteDVD(String name)
    {
        Iterator<Dvd> dvdIt = dvdHashSet.iterator();
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
       for (Dvd item : dvds) {
                System.out.println(item.getTitle());
            }
    }
}
