package abstraction;

public class Developer extends Employee implements WriteCode{

    public String work() {
        return "More Work?";
    }

    @Override
    public boolean debug() {
        return false;
    }

    @Override
    public void drinkCoffee() {
        System.out.println("ENGAGE HYPERDRIVE!!!");
    }
}
