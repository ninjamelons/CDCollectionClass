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
        personContainer = personContainer.getInstance();
    }
    
    public void addPerson(String name, String address, String city, String postalCode, String phoneNo)
    {
        personContainer.addPerson(name,address,city,postalCode,phoneNo);
    }
    
    public boolean updatePerson(String name, String address, String city, String postalCode, String phoneNo)
    {
        return personContainer.updatePerson(name,address,city,postalCode,phoneNo);
    }

    public boolean deletePerson(String phoneNo)
    {
        return personContainer.deletePerson(phoneNo);
    }
    
    public Person getPerson(String phoneNo)
    {
        Person result = null;
        result = personContainer.getPerson(phoneNo);
        return result;
    }
    
    public void getPersonDetails(String phoneNo)
    {
        Person person = personContainer.getPerson(phoneNo);
        
        System.out.println("      Person Details       ");
        System.out.println("   Name: " + person.getName());
        System.out.println("   Address: " + person.getAddress());
        System.out.println("   City: " + person.getCity());
        System.out.println("   Postal Code: " + person.getPostalCode());
        System.out.println("   Phone Number: " + person.getPhoneNo());
    }
}
