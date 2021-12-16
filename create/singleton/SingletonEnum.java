package create.singleton;

/**
 * 项目名：design-patterns
 * 包名：create.singleton
 * 文件名：null.java
 * 创建时间：2021/12/16-16:04
 *
 * @author jacky.li
 * 描述：饿汉式（枚举）
 */
public enum SingletonEnum {
    // 定义一个枚举的元素，它就是 SingletonEnum 的一个实例
    INSTANCE;

    public void doSomeThing() {
        System.out.println("枚举方法实现单例:" + toString());
    }

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
