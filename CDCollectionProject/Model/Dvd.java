package Model;

public class Dvd
{
    long barcode;
    String title;
    String artist;
    int publicationDate;
    
    public Dvd()
    {
        
    }
    
    public Dvd(long barcode, String title, String artist, int publicationDate)
    {
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;        
    }     
   
    public long getBarcode()
    {
        return barcode;
    }    
    
    public void setBarcode(long barcode)
    {
        this.barcode = barcode;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    
    public int getPublicationDate()
    {
        return publicationDate;
    }
    
    public void setPublicationDate(int publicationDate)
    {
        this.publicationDate = publicationDate;
    }
}
