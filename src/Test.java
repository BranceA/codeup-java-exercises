import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give me your name:");
        String name = input.nextLine();
        System.out.println("Give me your age:");
        byte age = input.nextByte();


        System.out.println("name = " + name);
        System.out.println("age = " + age);

//        String name = "codeup";
//        String cohort = "Ceres";
//        System.out.printf("Hello there, %s. Nice to see you.\n%s is pretty great.", name, cohort);

    }

}
