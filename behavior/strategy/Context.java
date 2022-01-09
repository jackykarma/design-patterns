package behavior.strategy;

/**
 * 项目名：IntelliJ IDEA
 * 包名：behavior.strategy
 * 文件名：null.java
 * 创建时间：2022/1/9
 *
 * @author jacky.li
 * @version v1.0.00
 * 描述：
 * @since
 */
public class Context {

    private Strategy strategy;

    /**
     * Context可以组装不同的strategy，如此可以改变contextApi的具体策略行为。
     * 用组合的方法比继承更加灵活。
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextApi() {
        this.strategy.doAlgorithm();
    }
}
