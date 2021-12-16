package create.singleton;

/**
 * 项目名：design-patterns
 * 包名：create.singleton
 * 文件名：null.java
 * 创建时间：2021/12/16-15:25
 *
 * @author jacky.li
 * 描述：饿汉式单例实现
 */
public class SingletonHungry {

    // 当一个Java类第一次被真正使用到的时候静态资源被初始化、Java类的加载和初始化过程都是线程安全的。
    // 在静态初始化器中创建单例实例，这段代码保证了线程安全
    private static final SingletonHungry singletonHungry = new SingletonHungry();

    // Singleton类只有一个构造方法并且是被private修饰的，所以用户无法通过new方法创建该对象实例
    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return singletonHungry;
    }
}
