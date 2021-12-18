package create.builder;

/**
 * 项目名：design-patterns
 * 包名：create.builder
 * 文件名：null.java
 * 创建时间：2021/12/18-08:06
 *
 * @author jacky.li
 * 描述：
 */
public class AppClient {

    public static void main(String[] args) {

        create.builder.apm.Car.Builder builder = new create.builder.apm.Car.Builder("NIO", "#FFFFFF");
        create.builder.apm.Car nioCar = builder.battery(new Battery())
                .logo(new Logo())
                .wheels(new Wheel[4])
                .motor(new ElectricMotor("NIO"))
                .frame(new CarFrame())
                .build();
        System.out.println(nioCar);

        create.builder.apm.Car teslaCar = builder.battery(new Battery())
                .logo(new Logo())
                .wheels(new Wheel[4])
                .motor(new ElectricMotor("NIO"))
                .frame(new CarFrame())
                .build();
        System.out.println(teslaCar);
    }
}
