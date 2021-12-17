package create.factory.simplefactory;

/**
 * 项目名：design-patterns
 * 包名：create.factory.simplefactory
 * 文件名：null.java
 * 创建时间：2021/12/17-10:58
 *
 * @author jacky.li
 * 描述：
 */
public class AppClient {

    public static void main(String[] args) {
        // 不应用设计模式时的做法, 直接针对具体的品牌电脑对象编程，客户端与具体的产品产生了依赖。
        HpComputer hpComputer = new HpComputer();
        hpComputer.run();
        ToshibaComputer toshibaComputer = new ToshibaComputer();
        toshibaComputer.run();
        LenovoComputer lenovoComputer = new LenovoComputer();
        lenovoComputer.run();

        // 用简单工厂后; 增加新的品牌只需添加新的电脑类（扩展），修改简单工厂类
        // 客户端代码只只有有一个工厂可以创建各种品牌的电脑，但是对具体的电脑产品对象一无所知（隔离）；将创建具体产品对象的工作移交给了工厂，而不是自己亲自创建，分工明确。
        IComputer hp = ComputerFactory.createComputer("Hp");
        hp.run();
        IComputer lenovo = ComputerFactory.createComputer("Lenovo");
        lenovo.run();
        IComputer toshiba = ComputerFactory.createComputer("Toshiba");
        toshiba.run();
    }
}
