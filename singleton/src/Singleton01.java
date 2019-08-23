/**
 * 多线程改进方法一
 */
public class Singleton01 {

    public static Singleton01 singleton01 =null;

    private Singleton01() {
    }


    public static synchronized Singleton01 getInstance() {

        if(singleton01==null) {
            singleton01 = new Singleton01();
        }
        return singleton01 ;
    }
}
