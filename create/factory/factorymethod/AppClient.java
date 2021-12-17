package create.factory.factorymethod;

import create.factory.simplefactory.IComputer;

/**
 * 项目名：design-patterns
 * 包名：create.factory.factorymethod
 * 文件名：null.java
 * 创建时间：2021/12/17-14:17
 *
 * @author jacky.li
 * 描述：
 */
public class AppClient {

    public static void main(String[] args) {
        // 工厂方法模式的好处是：当你要增加一款新的产品时更加灵活，容易扩展，比如
        // 增加DELL的电脑，那么遵循开放封闭原则，直接扩展出一个生产戴尔电脑的工厂和一个戴尔的产品类即可，而无需像简单工厂那样去修改工厂类的代码逻辑。
        // 每个产品对应用一个专门的工厂去生产，避免"混线生产"
        IComputerFactory hpFactory = new HpComputerFactory();
        IComputer hpComputer = hpFactory.createComputer();
        hpComputer.run();

        IComputerFactory lenovoFactory = new LenovoComputerFactory();
        IComputer lenovoFactoryComputer = lenovoFactory.createComputer();
        lenovoFactoryComputer.run();

        IComputerFactory toshibaFactory = new HpComputerFactory();
        IComputer toshibaComputer = toshibaFactory.createComputer();
        toshibaComputer.run();

    }
}
