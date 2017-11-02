package Model;
import java.util.*;

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
    
    public boolean deletePerson(String phoneNo)
    {
        Iterator<Person> personIt = friends.iterator();
        boolean result = false;
        while(personIt.hasNext())
        {
            Person nextP = personIt.next();
            if(nextP.getPhoneNo().equals(phoneNo))
            {
                personIt.remove();
                result = true;
            }
        }
        return result;
    }
    
    public Person getPerson(String phoneNo)
    {
        Person result = null;
        for(Person person : friends)
        {
            if(person.getPhoneNo().equals(phoneNo))
            {
                result = person;
            }
        }
        return result;
    }
    
    public void addLoan(String phoneNo, Date borrowerDate, String dvdCopy, String period)
    {
        Person person = getPerson(phoneNo);
        Copy newDvdCopy = new Copy(dvdCopy);
        Loan loan = new Loan(borrowerDate,newDvdCopy,period);
        person.setLoan(loan);
    }
    
    public boolean returnLoan(String phoneNo)
    {
        boolean result = false;
        Person person = getPerson(phoneNo);
        person.setLoan(null);
        if(person.getLoan() == null)
        {
            result = true;
        }
        return result;
    }
    
    public Loan getLoanDetails(String phoneNo)
    {
        Person person = getPerson(phoneNo);
        return person.getLoan();
    }
}
