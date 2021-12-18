package create.builder;

/**
 * 项目名：design-patterns
 * 包名：create.builder
 * 文件名：null.java
 * 创建时间：2021/12/18-08:03
 *
 * @author jacky.li
 * 描述：
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 总装师，开始总装得到产品
    public Car buildCar() {
        // 依次生产部件，并组装
        builder.buildBrand();
        builder.buildColor();
        // 利用钩子方法，控制生产流程与组合的部件
        if (builder.isElectric()) {
            builder.buildBattery();
        }
        builder.buildMotor();
        builder.buildWheels();
        builder.buildLogo();
        builder.buildFrame();

        return builder.createCar();
    }
}
