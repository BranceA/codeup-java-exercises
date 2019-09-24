public class Person {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public void sayHello(){
        System.out.format("Hello there %s!", name);
    }

    Person(String name){
        setName(name);
    }

    public static Person main(String name) {

        return new Person(name);

    }

}
