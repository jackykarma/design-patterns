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
public class AppClient {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.algorithm();
    }
}
