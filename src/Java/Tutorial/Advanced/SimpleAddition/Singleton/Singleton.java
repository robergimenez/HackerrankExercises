package Java.Tutorial.Advanced.SimpleAddition.Singleton;

/**
 * Created by rgimenez on 29/01/2017.
 */
public class Singleton {
    public String str;
    private static Singleton singleton;

    private Singleton(){
    }

    public static Singleton getSingleInstance(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
