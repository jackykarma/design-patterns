package behavior.template;

/**
 * 项目名：IntelliJ IDEA
 * 包名：behavior.template
 * 文件名：null.java
 * 创建时间：2022/1/9
 *
 * @author jacky.li
 * @version v1.0.00
 * 描述：
 * @since
 */
public abstract class AbstractClass {

    public void algorithm() {
        step1();
        step2();
        step3();
    }

    private void step3() {
        System.out.println("run step3");
    }

    protected abstract void step2();

    private void step1() {
        System.out.println("run step1");
    }
}
