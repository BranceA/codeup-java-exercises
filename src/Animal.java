public class Animal {

    private int age;
    private String species;
    private boolean isAlive;

    public Animal(int newAge, String newSpecies, boolean aliveStatus){
        this.age = newAge;
        this.species = newSpecies;
        this.isAlive = aliveStatus;
    }

    public Animal(){}

    public void setAge(int newAge){
        this.age = newAge;
    }

    public int getAge(){
        return this.age;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public String getSpecies(){
        return this.species;
    }

    public void setAlive(boolean aliveStatus){
        this.isAlive = aliveStatus;
    }

    public boolean getAlive(){
        return this.isAlive;
    }

}
