package Model;
import java.util.*;

public class Copy
{
    // instance variables - replace the example below with your own
    private static int staticSerialNumber = 0;
    private static final double purchasePrice = 20;
    private int serialNumber;
    private String dvdName;
    private Date purchaseDate = new Date();

    /**
     * Constructor for objects of class Copy
     */
    public Copy(String dvdName)
    {
        staticSerialNumber++;
        this.serialNumber = staticSerialNumber;
        this.dvdName = dvdName;
    }
    
    public Copy(Date purchaseDate, int serialNumber, String dvdName)
    {
        this.purchaseDate = purchaseDate;
        this.serialNumber = serialNumber;
        this.dvdName = dvdName;
    }
    
    public Date getPurchaseDate()
    {
        return purchaseDate;
    }
    
    public String getDvdName()
    {
        return dvdName;
    }
    
    public void setPurchaseDate()
    {
        this.purchaseDate = purchaseDate;
    }
    
    public int getSerialNumber()
    {
        return serialNumber;
    }
    
    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }  
    
    public double getPurchasePrice()
    {
        return purchasePrice;
    }
}