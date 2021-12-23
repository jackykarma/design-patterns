package structure.adapter;

/**
 * 项目名：design-patterns
 * 包名：structure.adapter
 * 文件名：null.java
 * 创建时间：2021/12/19-13:20
 *
 * @author jacky.li
 * 描述：
 */
public class AppClient {

    public static void main(String[] args) {
        // 客户端是不知道Adaptee的存在的
        Target target = new Adapter();
        target.request1();
        target.request2();
    }
}
