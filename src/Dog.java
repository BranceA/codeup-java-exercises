public class Dog extends Animal {

    private String breed;
    private String name;

    public Dog(int newAge, String newSpecies, boolean aliveStatus, String newBreed, String newName){
        super.setAge(newAge);
        super.setAlive(aliveStatus);
        super.setSpecies("Dog");
        this.breed = newBreed;
        this.name = newName;
    }

    public void setBreed(String newBreed){
        this.breed = newBreed;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

}
