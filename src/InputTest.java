import util.Input;
import shapes.Circle;

public class InputTest {

    public static void main(String[] args) {

        Input testInput = new Input();
//        System.out.println(testInput.getString());
//        System.out.println(testInput.yesNo());
//        System.out.println(testInput.getInt(2, 8));

        try{
            System.out.println(testInput.getInt(3, 99));
        } catch (Exception e){
            e.printStackTrace();
        }

//        System.out.println(testInput.getDouble(4, 12));
//        System.out.println(testInput.getDouble());
//        Circle newCircle = new Circle(5);
//        System.out.println(newCircle.getArea());
//        System.out.println(newCircle.getCircumference());

    }

}
