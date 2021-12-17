package create.factory.simplefactory;

/**
 * 项目名：design-patterns
 * 包名：create.factory.simplefactory
 * 文件名：null.java
 * 创建时间：2021/12/17-10:54
 *
 * @author jacky.li
 * 描述：
 */
public class ComputerFactory {

    /**
     * 根据品牌创建不同的品牌电脑
     * @param brand 电脑品牌名称
     * @return 电脑对象
     */
    public static IComputer createComputer(String brand) {
        IComputer iComputer;
        switch (brand) {
            case "Lenovo":{
                iComputer = new LenovoComputer();
                break;
            }
            case "Hp": {
                iComputer = new HpComputer();
                break;
            }
            case "Toshiba": {
                iComputer = new ToshibaComputer();
                break;
            }
            default:
                throw new IllegalStateException("sorry, 工厂无法生产你要的品牌的电脑");
        }
        return iComputer;
    }
}
