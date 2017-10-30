package Model;
import java.util.HashSet;

public class PersonContainer
{
    private HashSet<Person> friends;
    
    public PersonContainer()
    {
        friends = new HashSet<>();
    }
    
    private void addPerson(Person person)
    {
        if(person != null)
        {
            friends.add(person);
        }
        else
            System.out.println("Error 404: Person not found");
    }
}
