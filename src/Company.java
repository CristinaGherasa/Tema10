import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> persons;

    public Company() {
        persons = new ArrayList<>();
    }

    public Person getManager() {
        for(Person person : persons) {
            if(person.getPosition().equals("manager")){
                return person;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> filteredPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getPosition().equals(profession)) {
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> filteredPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > age) {
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> filteredPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(filterName)) {
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }

    public void employ(Person person) {
        persons.add(person);
    }

}
