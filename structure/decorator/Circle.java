package structure.decorator;

/**
 * 项目名：design-patterns
 * 包名：structure.decorator
 * 文件名：null.java
 * 创建时间：2021/12/25-14:45
 *
 * @author jacky.li
 * 描述：
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw a circle");
    }
}
