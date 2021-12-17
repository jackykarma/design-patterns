package create.prototype;

/**
 * 项目名：design-patterns
 * 包名：create.prototype
 * 文件名：null.java
 * 创建时间：2021/12/17-16:36
 *
 * @author jacky.li
 * 描述：需要被克隆的对象 通用实现
 */
public class ConcretePrototype implements IPrototype {

    private String attr1;
    private int attr2;

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public void setAttr2(int attr2) {
        this.attr2 = attr2;
    }

    public void print() {
        System.out.println(attr1);
        System.out.println(attr2);
    }

    @Override
    public IPrototype cloneSelf() {
        // 创建一个新的对象，并且把属性拷贝过去
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAttr1(this.attr1);
        concretePrototype.setAttr2(this.attr2);
        return concretePrototype;
    }
}
