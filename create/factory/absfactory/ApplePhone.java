package create.factory.absfactory;

/**
 * 项目名：design-patterns
 * 包名：create.factory.absfactory
 * 文件名：null.java
 * 创建时间：2021/12/17-15:46
 *
 * @author jacky.li
 * 描述：
 */
public class ApplePhone implements IPhone{
    @Override
    public void run() {
        System.out.println("这是苹果手机");
    }
}
