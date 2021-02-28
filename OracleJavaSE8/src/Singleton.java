/**
 * @author linh.truongthe
 */
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SINGLETON;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.toString());

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.toString());

    }

}