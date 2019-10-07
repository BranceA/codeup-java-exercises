package shapes;

import java.nio.file.Files;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ShapesTest implements Serializable {

    public static void main(String[] args) {

//        ObjectIOExample objectIO = new ObjectIOExample();

        Square myShape = new Square(7);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

//        Object objectIO ;
//        objectIO.WriteObjectToFile("text.txt", myShape);
//
//        try {
//
//            FileOutputStream fileOut = new FileOutputStream("text.txt");
//            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
//            objectOut.writeObject(myShape);
//            objectOut.close();
//            System.out.println("The Object  was succesfully written to a file");
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//
//        try {
//
//            FileInputStream fileIn = new FileInputStream("");
//            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
//
//            Object obj = objectIn.readObject();
//
//            System.out.println("The Object has been read from the file");
//            objectIn.close();
//            System.out.println(obj);
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return null;
//        }

    }

}
