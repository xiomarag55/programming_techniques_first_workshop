import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //The list of persons is created
        List<Person> persons = new ArrayList<>();

        //People are added to the list
        persons.add(new Person("Luis Carlos Arango", 50, "102372567", "Soltero", 1, 'S'));
        persons.add(new Person("Maria Lopez Ruiz", 60, "10237256", "Casada", 2, 'N'));
        persons.add(new Person("Jose Felix Restrepo", 81, "102372545", "Viudo", 1, 'N'));
        persons.add(new Person("Maria elvira Zapata", 70, "102372521", "Viuda", 3, 'S'));
        persons.add(new Person("Carlos Felipe Ruiz", 65, "102372545", "Soltero", 1, 'N'));
        persons.add(new Person("Fernando Miguel Pelaez", 50, "10237245", "Casado", 2, 'N'));
        persons.add(new Person("Mariela Montoya", 58, "102372566", "Casada", 1, 'S'));
        persons.add(new Person("Fernando Orozco", 53, "102372545", "Divorciado", 1, 'N'));
        persons.add(new Person("Felipe Sanchez", 76, "1023726546", "Viudo", 1, 'N'));

        //Number of persons in the site
        System.out.println("For this analysis, we used a total of "+persons.size()+" persons");
        for(Person person : persons){
            System.out.println("name: "+ person.getName()+ " age: "+person.getAge() + " pensioner: " + person.getIsPension());

        }
    }
}