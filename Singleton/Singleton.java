import java.util.*;

// This is a very simple implementation, not 100% correct:
// - It doesn't take into account multiple threads situations
// - Methods/class should be declared final, to avoid extensions/overriding
// - Method Clone should be overriden to avoid precisely that.

public class Singleton {
    
    private static Singleton instance; 

    private Singleton() {
        System.out.println("default constructor launched");
    }

    public static Singleton makeInstance() {
        if(instance == null){
            instance = new Singleton();
        } 
        return instance;
    }

}
