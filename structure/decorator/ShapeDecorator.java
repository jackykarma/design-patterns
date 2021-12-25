package structure.decorator;

/**
 * 项目名：design-patterns
 * 包名：structure.decorator
 * 文件名：null.java
 * 创建时间：2021/12/25-14:50
 *
 * @author jacky.li
 * 描述：不用接口而用抽象类，是因为要组合Shape基础组件对象，同时还要保持与基础对象一样的接口，因此要实现Shape接口
 */
public abstract class ShapeDecorator implements Shape {

    // 保留基础对象的特性
    private Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        // 基础组件的功能
        shape.draw();
    }
}
