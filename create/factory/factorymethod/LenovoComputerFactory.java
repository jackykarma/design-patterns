package create.factory.factorymethod;

import create.factory.simplefactory.IComputer;
import create.factory.simplefactory.LenovoComputer;

/**
 * 项目名：design-patterns
 * 包名：create.factory.factorymethod
 * 文件名：null.java
 * 创建时间：2021/12/17-14:16
 *
 * @author jacky.li
 * 描述：专门用于创建惠普电脑的工厂
 */
public class LenovoComputerFactory implements IComputerFactory {
    @Override
    public IComputer createComputer() {
        return new LenovoComputer();
    }
}
