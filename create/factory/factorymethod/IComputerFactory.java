package create.factory.factorymethod;

import create.factory.simplefactory.IComputer;

/**
 * 项目名：design-patterns
 * 包名：create.factory.factorymethod
 * 文件名：null.java
 * 创建时间：2021/12/17-14:14
 *
 * @author jacky.li
 * 描述：创建电脑产品的工厂接口
 */
public interface IComputerFactory {

    IComputer createComputer();
}
