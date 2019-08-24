package com.yt.factory;
/**
 * 看到没，这就是引入 enum 的好处，createHuman(HumanEnum humanEnum)这个方法定义了输入参数必须 是 HumanEnum 类型，
 * 然后直接使用 humanEnum.getValue()方法就能获得具体传递进来的值，这个不多说了，
 * 大家自己看程序领会，没多大难度，这个抽象类的目的就是减少下边实现类的代码量
 */
public abstract class AbstractHumanFactory implements HumanFactory {

    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;

        if(!humanEnum.getValue().equals("")) {
            try{
                //直接生产一个实例
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return human;
    }
}
