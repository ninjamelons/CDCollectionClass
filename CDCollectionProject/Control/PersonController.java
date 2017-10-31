package Control;
import Model.*;

/**
 * Write a description of class PersonController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonController
{
    private PersonContainer personContainer;
    
    public PersonController()
    {
        personContainer = new PersonContainer();
    }
    
    public void addPerson(String name, String address, String city, String postalCode, String phoneNo)
    {
        personContainer.addPerson(name,address,city,postalCode,phoneNo);
    }
    
    public boolean deletePerson(String name)
    {
        return personContainer.deletePerson(name);
    }
    
    public Person getPerson(String name)
    {
        Person result = null;
        result = personContainer.getPerson(name);
        return result;
    }
    
    public void getPersonDetails(String name)
    {
        Person person = personContainer.getPerson(name);
        
        System.out.println("      Person Details       ");
        System.out.println("   Name: " + person.getName());
        System.out.println("   Address: " + person.getAddress());
        System.out.println("   City: " + person.getCity());
        System.out.println("   Postal Code: " + person.getPostalCode());
        System.out.println("   Phone Number: " + person.getPhoneNo());
    }
    
    public void getCurrentLoan(String name)
    {
        Person person = personContainer.getPerson(name);
    }
}
