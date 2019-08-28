
/**
 * Builder的一种实现
 */
public class ConcreteBuider extends Builder {

    @Override
    public void buildPartA() {
        System.out.println("生产A");
    }

    @Override
    public void buildPartB() {
        System.out.println("生产B");
    }

    @Override
    public void buildPartC() {
        System.out.println("生产C");
    }

}
