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
public class ConcreteHandler1 extends Handler {

    @Override
    void handleRequest(int type) {
        super.handleRequest(type);
        if (type == 1) {
            System.out.println("handle request 1 over");
        } else {
            // 让继任者去处理
            successor.handleRequest(type);
        }
    }
}
