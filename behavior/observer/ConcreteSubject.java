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
public class ConcreteSubject extends Subject{

    private int subjectState;

    public int getSubjectState() {
        return subjectState;
    }

    public void changeSubjectState(int subjectState) {
        this.subjectState = subjectState;
        // subject状态改变，去通知观察者更新状态
        this.notifyUpdate();
    }
}
