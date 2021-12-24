package structure.bridge;

/**
 * 项目名：design-patterns
 * 包名：structure.bridge
 * 文件名：null.java
 * 创建时间：2021/12/24-09:28
 *
 * @author jacky.li
 * 描述：
 */
public abstract class Phone {

    protected PhoneSoftware phoneSoftware;

    public void setPhoneSoftware(PhoneSoftware phoneSoftware) {
        this.phoneSoftware = phoneSoftware;
    }

    /**
     * 手机上运行某个软件的接口
     */
    void runSoftware() {}
}
