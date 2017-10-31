package Model;
import java.util.HashSet;

public class PersonContainer
{
    private HashSet<Person> friends;
    
    public PersonContainer()
    {
        friends = new HashSet<>();
    }
    
    public void addPerson(Person person)
    {
        if(person != null)
        {
            friends.add(person);
        }
        else
            System.out.println("Error 404: Person not found");
    }
    
    public Person getPerson(String name)
    {
        Person result = null;
        for(Person person : friends)
        {
            if(person.getFriendName().equals(name))
            {
                result = person;
            }
        }
        return result;
    }
}
