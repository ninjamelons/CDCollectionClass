package Model;
import java.util.HashSet;
import java.util.Iterator;

public class PersonContainer
{
    public static PersonContainer instance = null;
    private HashSet<Person> friends;
    
    private PersonContainer()
    {
        friends = new HashSet<>();
    }
    
    public static PersonContainer getInstance()
    {
        if(instance == null)
        {
            instance = new PersonContainer();
        }
        return instance;
    }
    
    public void addPerson(String name, String address, String city, String postalCode, String phoneNo)
    {
        if(name != null)
        {
            friends.add(new Person(name,address,city,postalCode,phoneNo));
        }
        else
            System.out.println("Error 404: Failed to add person");
    }
    
    public boolean deletePerson(String name)
    {
        Iterator<Person> personIt = friends.iterator();
        boolean result = false;
        while(personIt.hasNext())
        {
            Person nextP = personIt.next();
            if(nextP.getName().equals(name))
            {
                personIt.remove();
                result = true;
            }
        }
        return result;
    }
    
    public Person getPerson(String name)
    {
        Person result = null;
        for(Person person : friends)
        {
            if(person.getName().equals(name))
            {
                result = person;
            }
        }
        return result;
    }
}
