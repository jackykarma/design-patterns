package structure.adapter;

/**
 * 项目名：design-patterns
 * 包名：structure.adapter
 * 文件名：null.java
 * 创建时间：2021/12/19-13:18
 *
 * @author jacky.li
 * 描述：
 */
public class Adapter implements Target{

    private final Adaptee adaptee = new Adaptee();

    @Override
    public void request1() {
         adaptee.specRequest1();
    }

    @Override
    public void request2() {
        adaptee.specRequest2();
    }
}
