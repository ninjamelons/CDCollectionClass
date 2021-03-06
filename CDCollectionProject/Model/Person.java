package Model;

//test

/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private String address;
    private String city;
    private String postalCode;
    private String phoneNo;
    private Loan loan;
    
    public Person(String name, String address, String city, String postalCode, String phoneNo)
    {
        this.name = name;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.phoneNo = phoneNo;
        loan = null;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public String getPostalCode()
    {
        return postalCode;
    }
    
    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }
    
    public String getPhoneNo()
    {
        return phoneNo;
    }
    
    public Loan getLoan()
    {
        return loan;
    }
    
    public void setLoan(Loan loan)
    {
        this.loan = loan;
    }
}
