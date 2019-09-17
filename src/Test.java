import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Traffic Light");
        String color = input.nextLine();

        switch (color) {
            case "red":
                System.out.println("OH GOD STOP!!!");
                break;
            case "yellow":
                System.out.println("SWEET CHRIST!!! YOU CAN MAKE IT!!!");
                break;
            case "green":
                System.out.println("HOLY HELL!!! THERE'S NO REASON TO SLOW DOWN!!!");
                break;
        }

    }

}
