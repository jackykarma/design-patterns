package structure.decorator;

/**
 * 项目名：design-patterns
 * 包名：structure.decorator
 * 文件名：null.java
 * 创建时间：2021/12/25-14:46
 *
 * @author jacky.li
 * 描述：
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a rectangle");
    }
}
