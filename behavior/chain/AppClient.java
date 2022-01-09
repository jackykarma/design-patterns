package behavior.chain;

/**
 * 项目名：IntelliJ IDEA
 * 包名：behavior.chain
 * 文件名：null.java
 * 创建时间：2022/1/9
 *
 * @author jacky.li
 * @version v1.0.00
 * 描述：
 * @since
 */
public class AppClient {

    public static void main(String[] args) {
        Handler first = new ConcreteHandler1();
        Handler second = new ConcreteHandler2();
        first.setSuccessor(second);
        second.setSuccessor(first);
        first.handleRequest(2);
        first.handleRequest(1);
    }
}
