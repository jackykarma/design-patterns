package structure.decorator;

/**
 * 项目名：design-patterns
 * 包名：structure.decorator
 * 文件名：null.java
 * 创建时间：2021/12/25-14:56
 *
 * @author jacky.li
 * 描述：
 */
public class BlueShapeDecorator extends ShapeDecorator{
    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        drawBlueBorder();
    }

    private void drawBlueBorder() {
        System.out.println("draw blue border");
    }
}
