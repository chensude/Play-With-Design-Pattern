/**
 *用"双重检查枷锁"
 *
 */
public class Singleton03 {

    private volatile static Singleton03 singleton03 ;

    private Singleton03() {

    }

    public static Singleton03 getInstance() {
        if(singleton03==null) {
            synchronized (Singleton03.class) {
                if(singleton03==null) {
                    singleton03=new Singleton03();
                }
            }
        }
        return singleton03;
    }
}
