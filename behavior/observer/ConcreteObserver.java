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
public class ConcreteObserver implements Observer {

    private int observerId;

    public ConcreteObserver(int observerId) {
        this.observerId = observerId;
    }

    @Override
    public void updateState(int newState) {
        System.out.println("observer " + observerId + " update state");
        // do something
    }
}
