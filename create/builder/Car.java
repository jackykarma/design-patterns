package create.builder;

/**
 * 项目名：design-patterns
 * 包名：create.builder
 * 文件名：null.java
 * 创建时间：2021/12/18-08:19
 *
 * @author jacky.li
 * 描述：汽车产品
 */
public class Car {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 车漆颜色
     */
    private String color;

    /**
     * 电动机或发电机
     */
    private Motor motor;

    /**
     * 车架
     */
    private CarFrame carFrame;

    /**
     * 车标
     */
    private Logo logo;

    /**
     * 轮子
     */
    private Wheel[] wheels;

    /**
     * 电池
     */
    private Battery battery;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public CarFrame getCarFrame() {
        return carFrame;
    }

    public void setCarFrame(CarFrame carFrame) {
        this.carFrame = carFrame;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
