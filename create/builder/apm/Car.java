package create.builder.apm;

import create.builder.*;

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

    private Car(Builder builder) {
        this.battery = builder.battery;
        this.logo = builder.logo;
        this.carFrame = builder.carFrame;
        this.brand = builder.brand;
        this.wheels = builder.wheels;
        this.motor = builder.motor;
    }

    public static class Builder {

        /**
         * 品牌
         */
        private final String brand;

        /**
         * 车漆颜色
         */
        private final String color;

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

        public Builder(String brand, String color) {
            this.brand = brand;
            this.color = color;
        }

        public Builder motor(Motor motor) {
            this.motor = motor;
            return this;
        }

        public Builder frame(CarFrame carFrame) {
            this.carFrame = carFrame;
            return this;
        }

        public Builder logo(Logo logo) {
            this.logo = logo;
            return this;
        }

        public Builder wheels(Wheel[] wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder battery(Battery battery) {
            this.battery = battery;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
