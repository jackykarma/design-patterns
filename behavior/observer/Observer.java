package behavior.observer;

/**
 * 项目名：IntelliJ IDEA
 * 包名：behavior.observer
 * 文件名：null.java
 * 创建时间：2022/1/9
 *
 * @author jacky.li
 * @version v1.0.00
 * 描述：
 * @since
 */
public interface Observer {

    /**
     * 观察者更新状态
     */
    void updateState(int newState);
}
