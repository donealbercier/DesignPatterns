package Examples;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}
    //declare all constructors to private

    public static Singleton getInstance() {
        //providing a static method that returns a reference to the instance.
        return INSTANCE;
    }

    /*A Singleton candidate must satisfy three requirements:

        ~ controls concurrent access to a shared resource.
        ~ access to the resource will be requested from multiple, disparate parts of the system.
        ~ there can be only one object.*/
}
