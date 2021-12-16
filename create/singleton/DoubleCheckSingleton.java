package create.singleton;

/**
 * 项目名：design-patterns
 * 包名：create.singleton
 * 文件名：null.java
 * 创建时间：2021/12/16-15:39
 *
 * @author jacky.li
 * 描述：双重检查
 */
public class DoubleCheckSingleton {

    // 双重检查锁定会失败的问题并不归咎于 JVM 中的实现 bug，而是归咎于 Java 平台内存模型。内存模型允许所谓的“无序写入”。
    // 因此使用volatile关键字以保证当doubleCheckSingleton变量被初始化成Singleton实例时，多个线程可以正确处理uniqueInstance变量; 避免指令重排序
    private static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton() {
        // 组织通过反射调用私有构造器来创建对象
        // 如果是通过getInstance进行，那么doubleCheckSingleton一定是null，因此不会抛出异常；
        // 如果是通过外部反射newInstance调用私有构造器的，那么也只能调用一次创建一个对象，而不能无限创建
        if (doubleCheckSingleton != null) {
            throw new IllegalStateException("Already Initialized");
        }
    }

    public static DoubleCheckSingleton getInstance() {
        // 第一次判断是否为null，是为了避免在已经创建了对象后仍要走不高效的synchronized代码块，以提高代码运行效率
        // 检查实例，如果不存在，就进入同步代码块
        if (doubleCheckSingleton == null) {
            // 只有第一次才彻底执行这里的代码
            synchronized (DoubleCheckSingleton.class) {
                // 进入同步代码块后，判断是否为null，若为null才创建对象
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
                return doubleCheckSingleton;
            }
        } else {
            return doubleCheckSingleton;
        }
    }
}
