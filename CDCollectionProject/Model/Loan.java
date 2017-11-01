package Model;

import java.util.*;

public class Loan
{    
    private Date borrowerDate = new Date();
    private int period;
    private boolean state;
    
    public Loan(Date borrowerDate, int period, boolean state)
    {
        this.borrowerDate = borrowerDate;
        this.period = period;
        this.state = state;
    }
    
    public Date getBorrowerDate()
    {
        return borrowerDate;
    }
    
    public void setBorrowerDate(Date borrowerDate)
    {
        this.borrowerDate = borrowerDate;
    }
    
    public int getPeriod()
    {
        return period;
    }
    
    public void setPeriod(int period)
    {
        this.period = period;
    }
    
    public boolean getState()
    {
        return state;
    }
    
    public void setState(boolean state)
    {
        this.state = state;
    }
}
