import java.util.Arrays;

public class ExceptionsLec {

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3};
        try{
            System.out.println(numbers[999]);
            if(true){
                throw new Exception("Something bad happened!");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("numbers = " + Arrays.toString(numbers));
    }
    
}
