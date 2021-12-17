package create.factory.absfactory;

/**
 * 项目名：design-patterns
 * 包名：create.factory.absfactory
 * 文件名：null.java
 * 创建时间：2021/12/17-15:52
 *
 * @author jacky.li
 * 描述：
 */
public class AppClient {

    public static void main(String[] args) {
        IDeviceFactory appleFac = new AppleFactory();
        appleFac.manufacturePad();
        appleFac.manufacturePhone();

        IDeviceFactory xiaomiFac = new XiaomiFactory();
        xiaomiFac.manufacturePad();
        xiaomiFac.manufacturePhone();
    }
}
