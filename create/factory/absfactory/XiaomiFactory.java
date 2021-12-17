package create.factory.absfactory;

/**
 * 项目名：design-patterns
 * 包名：create.factory.absfactory
 * 文件名：null.java
 * 创建时间：2021/12/17-15:47
 *
 * @author jacky.li
 * 描述：
 */
public class XiaomiFactory implements IDeviceFactory{
    @Override
    public IPhone manufacturePhone() {
        return new XiaomiPhone();
    }

    @Override
    public IPad manufacturePad() {
        return new XiaomiPad();
    }
}
