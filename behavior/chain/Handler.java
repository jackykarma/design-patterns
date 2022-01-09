package behavior.chain;

/**
 * 项目名：design-patterns
 * 包名：structure.adapter
 * 文件名：null.java
 * 创建时间：2021/12/19-13:11
 *
 * @author jacky.li
 * 描述：
 */
public abstract class Handler {

    /**
     * 继任者
     */
    protected Handler successor;

    /**
     * 设置继任者：下一个处理请求的对象
     * @param handler 继任者
     */
    protected void setSuccessor(Handler handler) {
        this.successor = handler;
    }

    /**
     * 处理请求
     */
    void handleRequest(int type) {}
}
