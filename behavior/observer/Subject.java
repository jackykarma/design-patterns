package behavior.observer;

import java.util.ArrayList;
import java.util.List;

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
public abstract class Subject {

    protected List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    /**
     * 注册新的观察者对象
     * @param observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者对象
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 更新发生时，通知观察者更新
     */
    protected void notifyUpdate() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).updateState(i);
        }
    }
}
