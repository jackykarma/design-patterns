package structure.decorator;

/**
 * 项目名：design-patterns
 * 包名：structure.decorator
 * 文件名：null.java
 * 创建时间：2021/12/25-14:54
 *
 * @author jacky.li
 * 描述：
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        drawRedBorder();
    }

    private void drawRedBorder() {
        System.out.println("draw red border");
    }
}
