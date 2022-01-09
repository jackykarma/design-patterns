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
public class AppClient {

    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver(1);
        Observer observer2 = new ConcreteObserver(2);
        Observer observer3 = new ConcreteObserver(3);
        Subject subject = new ConcreteSubject();
        subject.registerObserver(observer1);
        subject.notifyUpdate();

        subject.registerObserver(observer2);
        subject.registerObserver(observer3);
        subject.notifyUpdate();

        subject.removeObserver(observer2);
        subject.notifyUpdate();
    }
}
