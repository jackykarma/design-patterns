package structure.proxy.protect;

/**
 * 项目名：design-patterns
 * 包名：structure.proxy.protect
 * 文件名：null.java
 * 创建时间：2021/12/26-10:05
 *
 * @author jacky.li
 * 描述：
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real request");
    }
}
