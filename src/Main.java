import java.util.List;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.add("apple");
        basket.add("banana");
        basket.add("orange");
        basket.add("apple");

        System.out.println("Fruit count: " + basket.count());
        System.out.println("Unique fruit count: " + basket.uniqueFruitsCount());

        System.out.println("Is 'banana' in the basket? " + basket.find("banana"));
        System.out.println("Is 'grape' in the basket? " + basket.find("grape"));

        System.out.println("Removing 'orange' from the basket: " + basket.remove("orange"));
        System.out.println("Fruit count after removal: " + basket.count());

        System.out.println("Position of 'banana' in the basket: " + basket.position("banana"));

        System.out.println("Distinct fruits in the basket: " + basket.distinct());



        FlowerBouquet bouquet = new FlowerBouquet();

        bouquet.add("Rose");
        bouquet.add("Tulip");
        bouquet.add("Lily");
        bouquet.add("Sunflower");

        System.out.println("All flowers in the bouquet: " + bouquet.getAll());

        bouquet.add("Orchid");
        bouquet.add("Rose");

        System.out.println("All flowers in the bouquet: " + bouquet.getAll());

        System.out.println("Removing 'Tulip' from the bouquet: " + bouquet.remove("Tulip"));

        System.out.println("All flowers in the bouquet after removal: " + bouquet.getAll());




        Company company = new Company();

        Person manager = new Person("John", 40, "manager");
        Person welder1 = new Person("David", 35, "welder");
        Person welder2 = new Person("Michael", 30, "welder");
        Person carpenter1 = new Person("Andrew", 45, "carpenter");
        Person carpenter2 = new Person("Robert", 28, "carpenter");
        Person plumber = new Person("Emily", 33, "plumber");

        company.employ(manager);
        company.employ(welder1);
        company.employ(welder2);
        company.employ(carpenter1);
        company.employ(carpenter2);
        company.employ(plumber);

        System.out.println("Manager: " + company.getManager().getName());
        List<Person> welders = company.getPersons("welder");
        System.out.println("Welders:");
        for (Person welder : welders) {
            System.out.println(welder.getName());
        }

        List<Person> olderPersons = company.getPersonsOlder(35);
        System.out.println("Persons older than 35:");
        for (Person person : olderPersons) {
            System.out.println(person.getName());
        }

        List<Person> personsWithName = company.getPerson("a");
        System.out.println("Persons with names containing 'a':");
        for (Person person : personsWithName) {
            System.out.println(person.getName());
        }
    }
}