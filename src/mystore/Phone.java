package mystore;

public class Phone {

    private String number;
    private double screenSize;
    private String OS;

    public Phone(double sS, String OS) {
        this.screenSize = sS;
        this.OS = OS;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void callMeMaybe(String aNumber){
        System.out.println("callingn aNumber = " + aNumber);
    }

}
