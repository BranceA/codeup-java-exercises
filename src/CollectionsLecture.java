import java.util.ArrayList;
import java.util.HashMap;

import mystore.Iphone;
import mystore.Phone;

public class CollectionsLecture {

    public static void main(String[] args) {

        mapsExample();

        //Needs Class not primitive
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(8);
        System.out.println("numbers.size() = " + numbers.size());
        numbers.add(3);
        System.out.println("numbers.size() = " + numbers.size());
        numbers.add(7);
        numbers.add(8);
        numbers.add(1);

        numbers.remove(4);

        System.out.println(numbers.toString());

        ArrayList<Phone> phones = new ArrayList<>();

        phones.add(new Phone(5.5, "iOS"));
        phones.add(new Iphone(7.0));

        Iphone testPhone = new Iphone(7.0);

        testPhone.facialUnlock("test");

        phones.get(0).setNumber("234");

        System.out.println(phones.get(0).getNumber());

        HashMap<String, String> usernames = new HashMap<>();

        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        System.out.println(usernames);

        for(String user : usernames.keySet()){
            if(usernames.get(user).equalsIgnoreCase("zgulde")){
                System.out.println(user);
            }
        }

// checking if keys or values are present
        usernames.containsKey("Justin"); // true
        usernames.containsValue("fmendozaro"); // true

    }

    public static void mapsExample(){
        HashMap<Long, String> users = new HashMap<>();
        users.put(1L, "fmendozaro");
        users.put(2L, "orsinger");

        System.out.println(users.get(5L));
    }

}
