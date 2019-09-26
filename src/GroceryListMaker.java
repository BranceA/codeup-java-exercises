import util.Input;

import java.lang.reflect.Array;

public class GroceryListMaker {

    public static GroceryListItem[] groceryList = new GroceryListItem[0];

    public static void main(String[] args) {

        Input thisInput = new Input();
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("What would you like to do?\n1: Print all items\n2: Add a new item\n3: Exit");
            int userSelection = thisInput.getInt(1, 3);
            if (userSelection == 1) {
                if(groceryList.length == 0){
                    System.out.println("Sorry. There is nothing on the list.");
                } else {
                    System.out.println("=======================================================");
                    for (GroceryListItem item : groceryList) {
                        System.out.format("%-20s | %4d | %20s\n", item.name, item.quantity, item.category);
                    }
                    System.out.println("=======================================================");
                }
            } else if (userSelection == 2) {
                GroceryListItem newItem = new GroceryListItem();
                groceryList = addItem(groceryList, newItem);
                System.out.println("Item has been added.");
            } else if (userSelection == 3) {
                return;
            }

            System.out.println("Keep going? Y/N");
            keepGoing = thisInput.yesNo();

        }

        System.out.println("Smell ya later!");

    }

    public static GroceryListItem[] addItem(GroceryListItem[] oldList, GroceryListItem newestItem){
        int newLength = oldList.length + 1;
        GroceryListItem[] newList = new GroceryListItem[newLength];

        for(int i = 0; i < oldList.length; i++){
            newList[i] = oldList[i];
        }

        newList[oldList.length] = newestItem;
        return newList;

    }

}
