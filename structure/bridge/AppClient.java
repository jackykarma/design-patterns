package structure.bridge;

/**
 * 项目名：design-patterns
 * 包名：structure.bridge
 * 文件名：null.java
 * 创建时间：2021/12/24-09:34
 *
 * @author jacky.li
 * 描述：
 */
public class AppClient {

    public static void main(String[] args) {
        // 运行Apple Music软件
        // Phone phone = new ApplePhone(new MusicSoftware());
        Phone phone = new ApplePhone();
        phone.setPhoneSoftware(new MusicSoftware());
        phone.runSoftware();
        // 运行Apple Game软件
        // Phone phone1 = new ApplePhone(new GameSoftware());
        phone.setPhoneSoftware(new GameSoftware());
        phone.runSoftware();
        // phone1.runSoftware();

        // 运行Xiaomi Music软件
        // Phone phone2 = new XiaomiPhone(new MusicSoftware());
        Phone phone1 = new XiaomiPhone();
        phone1.setPhoneSoftware(new MusicSoftware());
        phone1.runSoftware();
        // 运行Xiaomi Game软件
        phone1.setPhoneSoftware(new GameSoftware());
        phone1.runSoftware();
        // Phone phone3 = new XiaomiPhone(new GameSoftware());
        // phone1.runSoftware();
    }
}