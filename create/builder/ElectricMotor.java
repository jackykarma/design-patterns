package create.builder;

/**
 * 项目名：design-patterns
 * 包名：create.builder
 * 文件名：ElectricMotor.java.java
 * 创建时间：2021/12/18-07:57
 *
 * @author jacky.li
 * 描述：电动机
 */
public class ElectricMotor implements Motor {

    private int attr1;
    private String attr2;
    private long attr3;

    public String getAttr2() {
        return attr2;
    }

    public ElectricMotor(String tesla) {
        attr2 = tesla;
    }
}
