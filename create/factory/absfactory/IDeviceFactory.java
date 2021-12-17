package create.factory.absfactory;

/**
 * 项目名：design-patterns
 * 包名：create.factory.absfactory
 * 文件名：null.java
 * 创建时间：2021/12/17-15:44
 *
 * @author jacky.li
 * 描述：定义的一个移动设备接口工厂
 */
public interface IDeviceFactory {

    /**
     * 生产手机设备
     */
    IPhone manufacturePhone();

    /**
     * 也可以生产平板设备
     */
    IPad manufacturePad();
}
