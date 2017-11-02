package Model;

import java.util.*;

public class Loan
{    
    private Date borrowerDate = new Date();
    private Copy dvdCopy;
    private String period;
    
    public Loan(Date borrowerDate, Copy dvdCopy, String period)
    {
        this.borrowerDate = borrowerDate;
        this.period = period;
        this.dvdCopy = dvdCopy;
    }
    
    public Date getBorrowerDate()
    {
        return borrowerDate;
    }
    
    public void setBorrowerDate(Date borrowerDate)
    {
        this.borrowerDate = borrowerDate;
    }
    
    public Copy getDvdCopy()
    {
        return dvdCopy;
    }
    
    public double getPrice()
    {
        return dvdCopy.getPurchasePrice();
    }
    
    public void setDvdCopy(Copy dvdCopy)
    {
        this.dvdCopy = dvdCopy;
    }
    
    public String getPeriod()
    {
        return period;
    }
    
    public void setPeriod(String period)
    {
        this.period = period;
    }
}
