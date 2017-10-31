package Control;

import Model.DvdContainer;

public class DvdController
{    
    DvdContainer dvdContainer;
    
    public DvdController()
    {
        dvdContainer = new DvdContainer();
    }
    
    public void addDVD(long tempBarcode, String tempTitle , String tempArtist, int tempPublicationDate)
    {
       dvdContainer.addDVD(tempBarcode,tempTitle,tempArtist,tempPublicationDate);
    }
    
    public void deleteDVD()
    {
        
    }   
    

}
