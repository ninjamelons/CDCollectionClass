package Model;
import java.util.*;

public class Copy
{
    // instance variables - replace the example below with your own
    private String serialNumber;
    private Date purchaseDate = new Date();
    private double purchasePrice;

    /**
     * Constructor for objects of class Copy
     */
    public Copy()
    {               
    }   
    
    public Copy(Date purchaseDate, String serialNumber, double purchasePrice)
    {
        this.purchaseDate = purchaseDate;
        this.serialNumber = serialNumber;
        this.purchasePrice = purchasePrice;
    }
    
    public Date getPurchaseDate()
    {
        return purchaseDate;
    }
    
    public void setPurchaseDate()
    {
        this.purchaseDate = purchaseDate;
    }
    
    public String getSerialNumber()
    {
        return serialNumber;
    }
    
    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }  
    
    public double getPurchasePrice()
    {
        return purchasePrice;
    }
    
    public void setPurchasePrice(double purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }
}