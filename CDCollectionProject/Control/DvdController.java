package Control;

import Model.DvdContainer;

public class DvdController
{    
    private DvdContainer dvdContainer;
    
    public DvdController()
    {
        dvdContainer = dvdContainer.getInstance();
    }
    
    public void addDVD(long tempBarcode, String tempTitle , String tempArtist, int tempPublicationDate)
    {
       dvdContainer.addDVD(tempBarcode,tempTitle,tempArtist,tempPublicationDate);
    }
    
    public void deleteDVD(String name)
    {
        dvdContainer.deleteDVD(name);
    }   
    
    public void listDVDs()
    {
        dvdContainer.listDVDs();
    }
}
