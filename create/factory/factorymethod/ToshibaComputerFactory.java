package create.factory.factorymethod;

import create.factory.simplefactory.IComputer;
import create.factory.simplefactory.ToshibaComputer;

/**
 * 项目名：design-patterns
 * 包名：create.factory.factorymethod
 * 文件名：null.java
 * 创建时间：2021/12/17-14:15
 *
 * @author jacky.li
 * 描述：专门用于创建东芝电脑的工厂
 */
public class ToshibaComputerFactory implements IComputerFactory{
    @Override
    public IComputer createComputer() {
        return new ToshibaComputer();
    }
}
