public class ArraysExercise {

    public static void main(String[] args) {

        Person[] people = new Person[3];

        people[0] = new Person("David", "Bowie");
        people[1] = new Person("Ziggy", "Stardust");
        people[2] = new Person("Aladdin", "Sane");

        Person newGuy = new Person("Davy", "Jones");

        Person[] newPeopleArray = addPerson(people, newGuy);

        for(Person person : newPeopleArray){
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson(Person[] oldPeople, Person newestPerson){
        int newLength = oldPeople.length + 1;
        Person[] newPeople = new Person[newLength];

        for(int i = 0; i < oldPeople.length; i++){
            newPeople[i] = oldPeople[i];
        }

        newPeople[oldPeople.length] = newestPerson;
        return newPeople;

    }

}
