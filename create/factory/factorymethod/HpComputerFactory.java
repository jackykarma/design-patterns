package create.factory.factorymethod;

import create.factory.simplefactory.HpComputer;
import create.factory.simplefactory.IComputer;

/**
 * 项目名：design-patterns
 * 包名：create.factory.factorymethod
 * 文件名：null.java
 * 创建时间：2021/12/17-14:15
 *
 * @author jacky.li
 * 描述：惠普电脑工厂，专门用于创建惠普电脑
 */
public class HpComputerFactory implements IComputerFactory{
    @Override
    public IComputer createComputer() {
        return new HpComputer();
    }
}
