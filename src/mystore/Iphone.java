package mystore;

public class Iphone extends Phone {

    public Iphone(double sS) {
        super(sS, "iOS");
    }

    protected boolean facialUnlock(String face){
        return true;
    }

}
