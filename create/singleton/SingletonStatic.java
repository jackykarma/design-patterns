package create.singleton;

/**
 * 项目名：design-patterns
 * 包名：create.singleton
 * 文件名：null.java
 * 创建时间：2021/12/16-15:49
 *
 * @author jacky.li
 * 描述：静态内部类方式实现
 */
public class SingletonStatic {

    private static class SingletonHolder {
        private static final SingletonStatic INSTANCE = new SingletonStatic();
    }

    private SingletonStatic() {}

    // 只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 INSTANCE
    // （只有第一次使用这个单例的实例的时候才加载，同时不会有线程安全问题）。
    public static SingletonStatic getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
