import util.Input;

public class GroceryListItem {

    public String name;
    public int quantity;
    public String category;

    public GroceryListItem(){
        Input thisInput = new Input();
        System.out.println("What is the name of the item?");
        name = thisInput.getString();
        System.out.println("How many do you want to buy?");
        quantity = thisInput.getInt();
        System.out.println("What category would you give this item?");
        category = thisInput.getString();
    }

}
