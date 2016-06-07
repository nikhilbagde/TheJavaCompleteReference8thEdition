package Chapter12;

/**
 * Created by Nikhil on 5/30/2016.
 */
public class AutoBoxing {
    //Autoboxing is used when there is requirement for using primitives as Objects
    // but its less efficient compared to primitives hence avoid exclusive use
    public static void main(String[] args) {
        Integer IntObject = 1000;
        System.out.println(IntObject.byteValue());
        System.out.println(IntObject);
    }
}
