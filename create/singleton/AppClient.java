package create.singleton;

/**
 * 项目名：design-patterns
 * 包名：create.singleton
 * 文件名：AppClient.java
 * 创建时间：2021/12/16-13:54
 *
 * @author jacky.li
 * @version v1.0.00
 * 描述：
 */
public class AppClient {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        SingletonStatic singletonStatic = SingletonStatic.getInstance();
        SingletonHungry singletonHungry = SingletonHungry.getInstance();
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.doSomeThing();
        SingletonEnum singletonEnumTow = SingletonEnum.INSTANCE;
        singletonEnumTow.doSomeThing();
    }
}
