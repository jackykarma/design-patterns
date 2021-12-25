package structure.decorator;

/**
 * 项目名：design-patterns
 * 包名：structure.decorator
 * 文件名：null.java
 * 创建时间：2021/12/25-14:57
 *
 * @author jacky.li
 * 描述：
 */
public class AppClient {

    public static void main(String[] args) {
        // 基本形状绘制
        Shape shape = new Circle();
        shape.draw();

        // 添加红色边框
        ShapeDecorator decorator = new RedShapeDecorator(shape);
        decorator.draw();

        decorator = new BlueShapeDecorator(shape);
        decorator.draw();
    }
}
