/**
 * 多线程改进方法一
 * 恶汉式
 */
public class Singleton02 {

    public static Singleton02 singleton02 =new Singleton02();

    private Singleton02() {
    }


    public static  Singleton02 getInstance() {

        return singleton02 ;
    }
}