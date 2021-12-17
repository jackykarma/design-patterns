package create.prototype;

/**
 * 项目名：design-patterns
 * 包名：create.prototype
 * 文件名：null.java
 * 创建时间：2021/12/17-16:37
 *
 * @author jacky.li
 * 描述：
 */
public class AppClient {

    public static void main(String[] args) {
        // 通用实现
        IPrototype iPrototype = new ConcretePrototype();
        IPrototype iPrototype1 = iPrototype.cloneSelf();
        IPrototype iPrototype2 = iPrototype.cloneSelf();
        // 两个对象不同
        System.out.println(iPrototype1);
        System.out.println(iPrototype2);

        // Java实现
        Book book = new Book();
        book.name = "Hello, World";
        Book book1 = book.clone();
        System.out.println(book1);
        Book book2 = book.clone();
        System.out.println(book2);
    }
}
