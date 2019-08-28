/**
 * 对外服务对象，用户关心的产品
 */
public class Director {

    private  Builder builder;



    public  Director(Builder builder) {

        this.builder=builder;

    }



    public  void setBuilder(Builder builder) {

        this.builder=builder;

    }



    //产品构建与组装方法

    public Product create() {

        builder.buildPartA();

        builder.buildPartB();

        builder.buildPartC();

        return builder.getResult();

    }
}
