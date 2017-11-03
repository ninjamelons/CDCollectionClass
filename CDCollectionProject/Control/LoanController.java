package Control;
import Model.*;
import java.util.*;

/**
 * Write a description of class LoanController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanController
{
    private PersonContainer personContainer;
    
    public LoanController()
    {
        personContainer = personContainer.getInstance();
    }
    
    public void addLoan(String phoneNo, Date borrowerDate, String dvdCopy, String period)
    {
        personContainer.addLoan(phoneNo, borrowerDate, dvdCopy, period);
    }
    
    public boolean returnLoan(String phoneNo)
    {
        return personContainer.returnLoan(phoneNo);
    }
    
    public void getLoanDetails(String phoneNo)
    {
        Loan loan = personContainer.getLoanDetails(phoneNo);
         
        System.out.println("       Loan Details        ");
        System.out.println("   Phone Number: " + phoneNo );
        System.out.println("   DVD Name: " + loan.getDvdCopy().getDvdName() );
        System.out.println("   Price: " + loan.getPrice() );
    }
}
