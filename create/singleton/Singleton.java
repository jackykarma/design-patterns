package create.singleton;

/**
 * 项目名：design-patterns
 * 包名：create.singleton
 * 文件名：null.java
 * 创建时间：2021/12/16-13:57
 *
 * @author jacky.li
 * 描述：懒汉式，线程不安全
 */
public class Singleton {

    private static Singleton singleton;

    // 禁止外部直接调用new方法创建对象
    private Singleton() {

    }

    // 没有加入synchronized关键字的版本是线程不安全的
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public synchronized static Singleton getInstanceSyn1() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static Singleton getInstanceSyn2() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }
    }
}
