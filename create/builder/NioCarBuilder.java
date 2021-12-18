package create.builder;

/**
 * 项目名：design-patterns
 * 包名：create.builder
 * 文件名：null.java
 * 创建时间：2021/12/18-07:56
 *
 * @author jacky.li
 * 描述：
 * FIXME:这种方式，此种builder只能生产特定属性组合的汽车，换个颜色都得重新定义一个builder
 */
public class NioCarBuilder extends Builder {

    @Override
    void buildBrand() {
        car.setBrand("NIO");
    }

    @Override
    void buildColor() {
        car.setColor("#AAA333");
    }

    @Override
    void buildMotor() {
        if (isElectric()){
            car.setMotor(new ElectricMotor("NIO"));
        } else {
            car.setMotor(new EngineMotor());
        }
    }

    @Override
    void buildFrame() {
        car.setCarFrame(new CarFrame());
    }

    @Override
    void buildLogo() {
        car.setLogo(new Logo());
    }

    @Override
    void buildWheels() {
        car.setWheels(new Wheel[4]);
    }

    @Override
    void buildBattery() {
        car.setBattery(new Battery());
    }

    @Override
    boolean isElectric() {
        return true;
    }
}
