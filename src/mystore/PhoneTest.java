package mystore;

public class PhoneTest {

    public static void main(String[] args) {

        Android pixel3 = new Android(5.1);
        Iphone iphone8 = new Iphone(6.1);
        Phone pixel4 = new Android(6.7);
        Phone inphoneX = new Iphone(5.6);

        iphone8.facialUnlock("myFace");

    }

}
