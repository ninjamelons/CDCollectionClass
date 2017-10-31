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
    
    public void addPerson(Person person)
    {
        personContainer.addPerson(person);
    }
    
    public Person getPerson(String name)
    {
        Person result = null;
        result = personContainer.getPerson(name);
        return result;
    }
}
