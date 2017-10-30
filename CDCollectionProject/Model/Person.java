package Model;


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
    private int postalCode;
    private int phoneNo;
    
    public Person()
    {
        
    }
    
    public Person(String name, String address, String city, int postalCode, int phoneNo)
    {
        this.name = name;
        this.address = address;
    }
}
