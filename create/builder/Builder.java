package create.builder;

/**
 * 项目名：design-patterns
 * 包名：create.builder
 * 文件名：null.java
 * 创建时间：2021/12/18-07:55
 *
 * @author jacky.li
 * 描述：
 */
public abstract class Builder {

    protected Car car = new Car();

    abstract void buildBrand();

    abstract void buildColor();

    abstract void buildMotor();

    abstract void buildFrame();

    abstract void buildLogo();

    abstract void buildWheels();

    abstract void buildBattery();

    /**
     * 加入钩子，判断是否是电动车
     */
    abstract boolean isElectric();

    Car createCar() {
        return car;
    };
}
