package create.prototype;

/**
 * 项目名：design-patterns
 * 包名：create.prototype
 * 文件名：null.java
 * 创建时间：2021/12/17-16:48
 *
 * @author jacky.li
 * 描述：
 */
public class Book implements Cloneable {

    public String name = "flower";

    public Book clone() {
        Book obj = null;
        try {
            obj = (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
