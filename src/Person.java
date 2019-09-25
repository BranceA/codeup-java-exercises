public class Person {

    private String firstName;
    private String lastName;
    public String getName() {
        return firstName + " " + lastName;
    }
    public Person(String fN, String lN){
        this.firstName = fN;
        this.lastName = lN;
    }

    public String sayHello(){
        return String.format("Hello from %s %s!", firstName, lastName);
    }

}
