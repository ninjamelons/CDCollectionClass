package Model;

import Model.Dvd;
import java.util.ArrayList;

public class DvdContainer
{
    ArrayList<Dvd> dvds;
    
    public DvdContainer()
    {
        dvds = new ArrayList<Dvd>();
    }
    
    public void addDVD(long tempBarcode,String tempTitle ,String tempArtist,int tempPublicationDate)
    {
       dvds.add(new Dvd(tempBarcode,tempTitle,tempArtist,tempPublicationDate));
    }
    
    public void deleteDVD()
    {
        
    }
}
