package structure.bridge;

/**
 * 项目名：design-patterns
 * 包名：structure.bridge
 * 文件名：null.java
 * 创建时间：2021/12/24-09:31
 *
 * @author jacky.li
 * 描述：
 */
public class GameSoftware implements PhoneSoftware {
    @Override
    public void runSoftware() {
        System.out.println("run game software");
    }
}
