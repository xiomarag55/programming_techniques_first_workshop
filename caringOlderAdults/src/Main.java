import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* This work shows a population of adults over 50 years of age
* and wants to show how many are pensioned and who are not, or if they are
* in a situation of vulnerability*/

public class Main {
    public static void main(String[] args) {

        //The list of persons is created
        List<Person> persons = new ArrayList<>();
        int sizeList= 0;
        int sumPersonPensioned = 0;
        int sumPersonNotPensioned = 0;
        int sumWomenPensioned = 0;
        int sumWomenNotPensioned = 0;
        int totalOlderPensioned = 0;
        int totalSituationVulnerability= 0;
        Map<String, Integer> vulnerablePerson = new HashMap<>();
        double averagePersonPensioned;
        double averageOlderNotPensioned;
        DecimalFormat formatDecimal = new DecimalFormat("0.00");


        //People are added to the list
        persons.add(new Person("Luis Carlos Arango", 50, "112372567", "Soltero", 1, 'S', 'M'));
        persons.add(new Person("Maria Lopez Ruiz", 60, "13237256", "Casada", 2, 'N', 'F'));
        persons.add(new Person("Jose Felix Restrepo", 81, "142372545", "Viudo", 1, 'N', 'M'));
        persons.add(new Person("Maria elvira Zapata", 70, "152372521", "Viuda", 3, 'S', 'F'));
        persons.add(new Person("Carlos Felipe Ruiz", 65, "162372545", "Soltero", 1, 'N', 'M'));
        persons.add(new Person("Fernando Miguel Pelaez", 50, "17237245", "Casado", 2, 'N','M'));
        persons.add(new Person("Mariela Montoya", 58, "182372566", "Casada", 1, 'S', 'F'));
        persons.add(new Person("Fernando Orozco", 53, "192372545", "Divorciado", 1, 'N','M'));
        persons.add(new Person("Felipe Sanchez", 76, "1023726510", "Viudo", 1, 'N','M'));
        persons.add(new Person("Carla Lopez", 60, "1023725611", "Casada", 2, 'N', 'F'));
        persons.add(new Person("Josefa Pérez", 60, "1023728812", "Casada", 2, 'N', 'F'));
        persons.add(new Person("Marta Reyes", 60, "1023789713", "Casada", 2, 'N', 'F'));

        //Size List
        sizeList = persons.size();
        //Number of persons in the site
        System.out.println("For this analysis, we used a total of "+sizeList+" persons");
        for(Person person : persons){
            System.out.println("name: "+ person.getName()+ " age: "+person.getAge() + " pensioner: " + (person.getIsPension() =='S'?"Si":"No"));
            if(person.getIsPension() == 'S'){
                sumPersonPensioned++;
            }else{
                sumPersonNotPensioned++;
            }
            //Total women pensioners
            if(person.getIsPension() == 'S' && person.getSex() == 'F'){
                sumWomenPensioned++;
            }
            if(person.getIsPension() == 'N' && person.getSex() == 'F'){
                sumWomenNotPensioned++;
            }
            //Number of pensioners over 60 years old
            if(person.getIsPension() == 'S' && person.getAge() > 60){
                totalOlderPensioned++;
            }
            if(person.getIsPension() == 'N' && person.getStratum() < 2){
                vulnerablePerson.put(person.getIdentityDocument(), person.getStratum());
                totalSituationVulnerability++;

            }


        }
        //Average pensioners
        averagePersonPensioned = (double) sumPersonPensioned/sizeList;
        averageOlderNotPensioned =  (double) totalOlderPensioned/sizeList;

        System.out.println("--------------Number of pensioners and non-pensioned persons---------------");
        System.out.println("Pensioners: " + sumPersonPensioned+" non-pensioned: " + sumPersonNotPensioned);

        System.out.println("--------------Number of women pensioners and non-pensioned women---------------");
        System.out.println("The number of women who are pensioners is: " + sumWomenPensioned);
        System.out.println("The number of women who are non-pensioned is: " + sumWomenNotPensioned);

        System.out.println("--------------Number of pensioners over 60 years of age---------------");
        System.out.println("Pensioned: " + totalOlderPensioned);

        System.out.println("--------------Average number of pensioners---------------");
        System.out.println("Average: " + formatDecimal.format(averagePersonPensioned));
        System.out.println("Total older not pensioned: " + formatDecimal.format(averageOlderNotPensioned));

        System.out.println("--------------Adults in situation of vulnerability---------------");
        System.out.println("Vulnerability situation: " + totalSituationVulnerability);

        System.out.println("--------------List of documents to be reviewed for assistance---------------");
        for(Map.Entry<String, Integer> person : vulnerablePerson.entrySet()){
            System.out.println("Document: " + person.getKey() + " Stratum: " + person.getValue());

        }

    }
}