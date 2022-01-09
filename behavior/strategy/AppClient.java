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
public class AppClient {

    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy1 = new Strategy1();
        context.setStrategy(strategy1);
        context.contextApi();

        // 更换策略2
        Strategy strategy2 = new Strategy2();
        context.setStrategy(strategy2);
        context.contextApi();

        // 更换策略3
        Strategy strategy3 = new Strategy3();
        context.setStrategy(strategy3);
        context.contextApi();
    }
}
